package hm.edu.cs.algdat.sorting.sorters;

import hm.edu.cs.algdat.sorting.framework.AbstractSorter;
import hm.edu.cs.algdat.sorting.framework.Sortable;

/**
 * Implementierung von Bubble-Sort als {@link AbstractSorter}.
 * @author katz.bastian
 */
public class BubbleSorter extends AbstractSorter {

	@Override
	protected <T extends Comparable<T>> void sort(Sortable<T> input) {
		
		int pos = 0;
		boolean swaps = false;
		
		for (int i = 0; i < input.length(); i++) {
			swaps = false;
			pos = 0;
			while (pos < (input.length() - i)) {
				if (pos == 0 || input.lessOrEqual(pos - 1, pos)) {
					pos++;
				} else {
					input.swap(pos, pos - 1);
					swaps = true;
				}
			}
			if (swaps == false) {
				i = input.length();
			}
		}
	}

}
