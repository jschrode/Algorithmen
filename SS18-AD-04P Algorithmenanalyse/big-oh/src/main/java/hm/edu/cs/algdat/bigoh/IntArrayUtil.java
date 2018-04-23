package hm.edu.cs.algdat.bigoh;

import java.util.Random;

import org.apache.commons.lang.time.StopWatch;

public class IntArrayUtil {

	public static void main(String[] args) {

		// Demo-Code zum Messen der Laufzeit der Schnittmengenberechnung für
		// zwei gleich große Arrays
		final int N = 1000000;

		// Erstellung zwei sortierte Arrays
		int[] input1 = createSortedArray(N, 0);
		int[] input2 = createSortedArray(N, N / 2);

		// Je nach Lösung können die Eingaben noch gemischt werden
		// shuffle(input1);
		// shuffle(input2);

		StopWatch watch = new StopWatch();
		watch.start();
		int count = countIntersectionUnsorted(input1, input2);
		assert (count == N / 2);
		watch.stop();
		System.out.println("Laufzeit " + watch.getTime() + "ms");

	}

	/**
	 * Diese Methode zählt die in beiden Eingabearrays vorkommenden Zahlen mit
	 * einer Laufzeit in O(n^2).
	 *
	 * @param unsorted
	 *            erstes Array, darf unsortiert sein, aber keine doppelten
	 *            Zahlen enthalten.
	 * @param unsorted2
	 *            zweites Array, darf unsortiert sein, aber keine doppelten
	 *            Zahlen enthalten.
	 * @return Anzahl der ein beiden Arrays vorkommenden Zahlen
	 */
	public static int countIntersectionUnsorted(int[] unsorted, int[] unsorted2) {
		int result = 0;
		for (int i : unsorted) {
			for (int j : unsorted2) {
				if (i == j) {
					result++;
				}
			}
		}		
		return result;
	}

	/**
	 * Diese Methode zählt die in beiden Eingabearrays vorkommenden Zahlen mit einer
	 * Laufzeit in O(n*log(n)).
	 *
	 * @param unsorted
	 *            erstes Array, darf unsortiert sein, aber keine doppelten
	 *            Zahlen enthalten.
	 * @param sorted
	 *            zweites Array, muss aufsteigend sortiert sein, aber keine
	 *            doppelten Zahlen enthalten.
	 * @return Anzahl der in beiden Arrays vorkommenden Zahlen
	 */
	public static int countIntersectionOneInputSorted(int[] unsorted, int[] sorted) {
		int result = 0;
		for (int i : unsorted) {
			if (binarySearch(sorted, i)) {
				result++;				
			}
		}
		return result;
	}

	/**
	 * Implementierung der Binären Suche aus der Vorlesung. Sucht ein Element in
	 * einer sortierten Liste von Ganzzahlen.
	 *
	 * @param sorted
	 *            Array von Ganzzahlen, aufsteigend sortiert
	 * @param element
	 *            zu suchendes Element
	 * @return {@code true} genau dann, wenn das gesuchte Element im Array
	 *         vorkommt.
	 */
	private static boolean binarySearch(int[] sorted, int element) {
		int lo = 0, hi = sorted.length - 1;
		while (lo <= hi) {
			int m = (lo + hi) / 2;
			if (sorted[m] == element)
				return true;
			if (sorted[m] > element)
				hi = m - 1;
			if (sorted[m] < element)
				lo = m + 1;
		}
		return false;
	}

	/**
	 * Diese Methode zählt die in beiden Eingabearrays vorkommenden Zahlen
	 * (Schnitt) mit einer Laufzeit in O(n).
	 *
	 * @param unsorted
	 *            erstes Array, muss aufsteigend sortiert sein, aber keine
	 *            doppelten Zahlen enthalten.
	 * @param sorted
	 *            zweites Array, muss aufsteigend sortiert sein, aber keine
	 *            doppelten Zahlen enthalten.
	 * @return Anzahl der in beiden Arrays vorkommenden Zahlen
	 */
	public static int countIntersectionSorted(int[] sorted, int[] sorted2) {
		int result = 0;
		
		// TODO: Aufgabe 2.3
		return result;
	}

	/* Hilfsmethoden */
	/**
	 * Mischt ein Array von Zahlen.
	 * 
	 * @param array
	 *            Array von Zahlen
	 */
	public static void shuffle(int[] array) {
		Random r = new Random();
		for (int i = 0; i < array.length; i++) {
			int index = i + r.nextInt(array.length - i);
			if (index != i) {
				array[i] -= array[index];
				array[index] += array[i];
				array[i] = array[index] - array[i];
			}
		}
	}

	/**
	 * Erstellt ein Array mit den Zahlen von offset bis offset+length-1
	 * (aufsteigend sortiert).
	 * 
	 * @param length
	 *            Größe
	 * @param offset
	 *            kleinste Zahl zum Füllen des Arrays
	 * @return gefülltes Array
	 */
	public static int[] createSortedArray(int length, int offset) {
		int[] result = new int[length];
		for (int i = 0; i < length; i++) {
			result[i] = i + offset;
		}
		return result;

	}
}
