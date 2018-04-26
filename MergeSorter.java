package hm.edu.cs.algdat.sorting.sorters;

import hm.edu.cs.algdat.sorting.framework.AbstractSorter;
import hm.edu.cs.algdat.sorting.framework.Sortable;

/**
 * Implementierung von Merge-Sort als {@link AbstractSorter}.
 * @author katz.bastian
 */
public class MergeSorter extends AbstractSorter {

	@Override
	protected <T extends Comparable<T>> void sort(Sortable<T> input) {
		sort(input, 0, input.length() - 1);
	}

	private <T extends Comparable<T>> void sort(Sortable<T> input, int lo, int hi) {
		if (lo < hi) {
			int mid = (lo + hi + 1) / 2;
			sort(input, lo, mid-1);
			sort(input, mid , hi);
			merge(input, lo, mid, hi);
		}
	}

	private <T extends Comparable<T>> void merge(Sortable<T> input, int lo, int mid, int hi) {
		int len = hi - lo + 1;
		int[] temp = new int[len];
		for (int k = 0, li = lo, re = mid; k < len; k++)
			if ((li < mid) && ((re > hi) || input.less(li, re))) {
				temp[li-lo] = k; 
				li++;
			} else {
				temp[re-lo] = k;
				re++;
			}
		for (int k = 0; k < len; k++) {
			while (temp[k]!=k) {
				input.swap(lo+k, lo+temp[k]);
				int t = temp[k];
				temp[k] = temp[temp[k]];
				temp[t] = t;
			}
		}
	}



}
