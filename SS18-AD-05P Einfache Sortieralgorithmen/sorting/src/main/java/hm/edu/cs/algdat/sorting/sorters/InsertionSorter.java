package hm.edu.cs.algdat.sorting.sorters;

import hm.edu.cs.algdat.sorting.framework.AbstractSorter;
import hm.edu.cs.algdat.sorting.framework.Sortable;

/**
 * Implementierung von Insertion-Sort als {@link AbstractSorter}.
 * @author katz.bastian
 */
public class InsertionSorter extends AbstractSorter {

	@Override
	protected <T extends Comparable<T>> void sort(Sortable<T> input) {
		
		for (int i = 0; i < input.length(); i++) {
			int j = i;
			while (j > 0 && input.less(j, j - 1)) {
				input.swap(j, j - 1);
				j--;
			}
		}
	}

}
