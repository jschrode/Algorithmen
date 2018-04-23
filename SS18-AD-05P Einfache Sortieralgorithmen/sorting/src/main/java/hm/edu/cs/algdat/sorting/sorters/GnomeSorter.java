package hm.edu.cs.algdat.sorting.sorters;

import hm.edu.cs.algdat.sorting.framework.AbstractSorter;
import hm.edu.cs.algdat.sorting.framework.Sortable;

/**
 * Implementierung von Gnome-Sort als {@link AbstractSorter}.
 * @author katz.bastian
 */
public class GnomeSorter extends AbstractSorter {

	@Override
	protected <T extends Comparable<T>> void sort(Sortable<T> input) {
		
		int pos = 0;
				
		while (pos < input.length()) {
			if (pos == 0 || input.lessOrEqual(pos - 1, pos)) {
				pos++;
			} else {
				input.swap(pos, pos - 1);
				pos--;
			}
		}
		
	}

}
