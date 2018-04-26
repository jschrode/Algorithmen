package hm.edu.cs.algdat.sorting.sorters;

import hm.edu.cs.algdat.sorting.framework.AbstractSorter;
import hm.edu.cs.algdat.sorting.framework.Sortable;

/**
 * Implementierung von Quick.Sort als {@link AbstractSorter}.
 * 
 * @author katz.bastian
 */
public class QuickSorter extends AbstractSorter {

	@Override
	protected <T extends Comparable<T>> void sort(Sortable<T> input) {
		sort(input, 0, input.length() - 1);
	}

	private <T extends Comparable<T>> void sort(Sortable<T> input, int lo, int hi) {
		if (hi <= lo)
			return;
		int pivotIndex = (4 * lo + hi) / 5;
		int j = partition(input, lo, hi, pivotIndex);
		sort(input, lo, j - 1);
		sort(input, j + 1, hi);
	}

	private <T extends Comparable<T>> int partition(Sortable<T> input, int lo, int hi, int pivotIndex) {
		// TODO: Implementierung der Pivotisierung. Zurückgegeben wird die
		// Position des Pivotelementes nach der Pivotisierung
		for (int i = 0; i < (pivotIndex - 1); i++) {
			for (int j = (input.length() - 1); i > pivotIndex; i--) {
				if (input.greater(i, pivotIndex) || input.less(j, pivotIndex)) {
					input.swap(i, j);
				}
			}
		}

		return ;
	}

}
