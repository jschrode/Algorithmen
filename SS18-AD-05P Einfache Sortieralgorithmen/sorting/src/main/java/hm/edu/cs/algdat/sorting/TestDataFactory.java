package hm.edu.cs.algdat.sorting;

import java.util.Random;
import java.util.stream.IntStream;

public class TestDataFactory {

	// Um reproduzierbar dieselben Werte zu bekommen, fixieren wir den Seed.
	private static final int SEED = 515;

	/**
	 * Erzeugt ein sortiertes Array mit n eindeutigen Elementen
	 * 
	 * @param size
	 *            Anzahl der Elemente
	 * @return Array mit den Elementen 0..(size-1).
	 */
	public static final Integer[] createSortedArray(int size) {
		return IntStream.rangeClosed(1, size).boxed().toArray(Integer[]::new);
	}

	/**
	 * Erzeugt ein umgekehrt sortiertes Array.
	 * 
	 * @param size
	 *            Anzahl der Elemente
	 * @return Array mit den Elementen (size-1)...0.
	 */
	public static final Integer[] createReverseSortedArray(int size) {
		return IntStream.rangeClosed(1, size).map(n -> size - n + 1).boxed().toArray(Integer[]::new);
	}

	/**
	 * Erzeugt ein Array mit zufälliger Reihenfolge
	 * 
	 * @param size
	 *            Anzahl der Elemente
	 * @return Array mit den Elementen 0..(size-1) in zufälliger Reihenfolge
	 */
	public static final Integer[] createRandomArray(int size) {
		// Damit alle dieselben Werte bekommen waehlen wir festen Seed
		Random r = new Random(SEED);
		Integer[] result = createSortedArray(size);
		for (int i = 0; i < result.length; i++) {
			swap(result, i, i + r.nextInt(size - i));
		}
		return result;
	}

	/**
	 * Erzeugt ein Array mit annähernd sortierter Reihenfolge
	 * 
	 * @param size
	 *            Anzahl der Elemente
	 * @param swaps
	 *            Anzahl der zufälligen Vertauschunden nach Erstellung eines
	 *            sortierten Arrays
	 * @return Array mit Elementen 0..(size-1), das gegenüber der korrekten
	 *         Reihenfolge eine Reihe von Vertauschungen aufweist.
	 */
	public static final Integer[] createArrayWithRandomSwaps(int size, int swaps) {
		Random r = new Random(SEED);
		Integer[] result = createSortedArray(size);
		for (int i = 0; i < swaps; i++) {
			swap(result, r.nextInt(size), r.nextInt(size));
		}
		return result;
	}

	/**
	 * Erzeug ein Array aus zwei Teilen. Der erste Teil enthält eine sortierte
	 * Folge von Zahlen aus 0..(size-1) mit Lücken, der zweite Teil enthält die
	 * fehlenden Zahlen in unsortierter Reihenfolge.
	 * 
	 * @param size
	 *            Anzahl der Elemente (insgesamt)
	 * @param probabilityOfUnsortedness
	 *            Wahrscheinlichkeit einer Zahl, im unsortierten Teil zu kommen.
	 * @return Erzeugtes Array
	 */
	public static final Integer[] createPartiallySortedArray(int size, double probabilityOfUnsortedness) {
		Random r = new Random(SEED);
		Integer[] result = new Integer[size];
		int frontIndex = 0;
		int backIndex = size - 1;
		int value = 1;
		while (frontIndex <= backIndex) {
			if (r.nextDouble() < probabilityOfUnsortedness) {
				result[backIndex--] = value++;
			} else {
				result[frontIndex++] = value++;
			}
		}
		for (int i = backIndex + 1; i < result.length; i++) {
			swap(result, i, i + r.nextInt(size - i));
		}
		return result;
	}

	private static void swap(Integer[] array, int index1, int index2) {
		int tmp = array[index1];
		array[index1] = array[index2];
		array[index2] = tmp;
	}
}
