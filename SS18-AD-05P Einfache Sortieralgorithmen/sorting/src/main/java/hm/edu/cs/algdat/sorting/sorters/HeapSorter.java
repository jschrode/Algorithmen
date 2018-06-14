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
		
		for (int i = 0; i <= input.length() - 1; i++) {
			deleteMax(input, input.length() - 1 - i);
		}
	}

	private <T extends Comparable<T>> void makeHeap(Sortable<T> input) {
		// Implementierung in Aufgabe 1.1
		
		for (int i = input.length() - 1; i >= 0; i--) {
			sink(input, i, input.length() - 1);
		}
	}
	
	private <T extends Comparable<T>> void sink(Sortable<T> input, int index, int lastHeapIndex) {
		// Implementierung in Aufgabe 1.1
		
		int leftChild = (index * 2) + 1;
		int rightChild = (index * 2) + 2;
		
		if (rightChild <= lastHeapIndex) {
			if (input.greater(leftChild, rightChild)) {
				if (input.greater(leftChild, index)) {
					input.swap(leftChild, index);
				}
				sink(input, leftChild, lastHeapIndex);
			}
			if (input.greater(rightChild, leftChild)) {
				if (input.greater(rightChild, index)) {
					input.swap(rightChild, index);
				}
				sink(input, rightChild, lastHeapIndex);
			}
		}
		
		if (leftChild == lastHeapIndex) {
			if (input.greater(leftChild, index)) {
				input.swap(leftChild, index);
			}
		}
		
	}
	
	private <T extends Comparable<T>> void deleteMax(Sortable<T> input, int lastHeapIndex) {
		// Implementierung in Aufgabe 1.2
		
		input.swap(0, lastHeapIndex);
		sink(input, 0, lastHeapIndex - 1);
	}
	

}
