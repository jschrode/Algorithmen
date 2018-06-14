package hm.edu.cs.algdat.sorting.sorters;

import hm.edu.cs.algdat.sorting.framework.AbstractSorter;
import hm.edu.cs.algdat.sorting.framework.Sortable;

/**
 * Implementierung von Heap-Sort als {@link AbstractSorter}.
 * @author katz.bastian
 */
public class HeapSorter extends AbstractSorter {

	@Override
	protected <T extends Comparable<T>> void sort(Sortable<T> input) {
		makeHeap(input);
		// Erweiterung in Aufgabe 1.2
	}

	private <T extends Comparable<T>> void makeHeap(Sortable<T> input) {
		// Implementierung in Aufgabe 1.1
	}
	
	private <T extends Comparable<T>> void sink(Sortable<T> input, int index, int lastHeapIndex) {
		// Implementierung in Aufgabe 1.1
	}
	
	private <T extends Comparable<T>> void deleteMax(Sortable<T> input, int lastHeapIndex) {
		// Implementierung in Aufgabe 1.2
	}
	

}
