package hm.edu.cs.algdat.sorting;

import java.util.LinkedList;
import java.util.List;

import hm.edu.cs.algdat.sorting.framework.AbstractSorter;
import hm.edu.cs.algdat.sorting.sorters.BetterMergeSorter;
import hm.edu.cs.algdat.sorting.sorters.BubbleSorter;
import hm.edu.cs.algdat.sorting.sorters.GnomeSorter;
import hm.edu.cs.algdat.sorting.sorters.InsertionSorter;
import hm.edu.cs.algdat.sorting.sorters.MergeSorter;
import hm.edu.cs.algdat.sorting.sorters.QuickSorter;
import hm.edu.cs.algdat.sorting.sorters.SelectionSorter;

public class Main {

	public static final int SIZE = 10000;

	public static void main(String[] args) {

		// Erstelle Sortieralgorithmen
		List<AbstractSorter> sorters = new LinkedList<AbstractSorter>();
		// sorters.add(new GnomeSorter());
		// sorters.add(new InsertionSorter());
		// sorters.add(new SelectionSorter());
		// sorters.add(new BubbleSorter());
		sorters.add(new MergeSorter());
		sorters.add(new BetterMergeSorter());
		sorters.add(new QuickSorter());

		
		// Lasse Algorithmen gegen verschiedene Eingaben laufen
		runSortersOnInput(sorters, TestDataFactory.createSortedArray(SIZE), "SORTIERT");

		// Eingabe weicht um n/20 zufällige Sortierungen von sortierter Eingabe ab
		runSortersOnInput(sorters, TestDataFactory.createArrayWithRandomSwaps(SIZE, SIZE / 20), "VERTAUSCHUNGEN 5%");
		
		// Eingabe enthält zuerst 90% der Zahlen sortiert, dann die fehlenden 10% unsortiert
		runSortersOnInput(sorters, TestDataFactory.createPartiallySortedArray(SIZE, 0.10), "TEILSORTIERT 90%");

		runSortersOnInput(sorters, TestDataFactory.createRandomArray(SIZE), "UNSORTIERT");

		runSortersOnInput(sorters, TestDataFactory.createReverseSortedArray(SIZE), "UMGEKEHRT SORTIERT");

	}

	/* Hilfsmethoden, nicht relevant zur Bearbeitung der Aufgaben. */

	/**
	 * Hilfsmethode, die dieselbe Eingabe nacheinander mit verschiedenen
	 * Sortieralgorithmen sortiert.
	 * 
	 * @param sorters
	 *            Sortieralgorithmen
	 * @param input
	 *            Eingabe
	 */
	private static void runSortersOnInput(List<AbstractSorter> sorters, Integer[] input, String label) {
		System.out.println(label+":");
		for (AbstractSorter sorter : sorters) {
			sorter.sort(input);
		}
		System.out.println("\n");
	}


}
