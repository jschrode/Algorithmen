package hm.edu.cs.algdat.sorting.framework;

import org.apache.commons.lang.StringUtils;

/**
 * Abstraktion für eine Sequenz sortierbarer Werte, die nur paarweise Vergleiche
 * und Vertauschung zulässt. Zählt ab der Erstellung die Anzahl der
 * durchgeführten Vergleiche und Vertauschungen mit.
 * 
 * @author katz.bastian
 *
 * @param <T>
 *            Vergleichbarer Typ
 */
public final class Sortable<T extends Comparable<T>> {

	private T[] array;
	private long compareCount = 0;
	private long swapCount = 0;

	/** @return Anzahl der Vergleiche seit Erstellung */
	public long getCompareCount() {
		return compareCount;
	}

	/** @return Anzahl der Vertauschungen seit Erstellung */
	public long getSwapCount() {
		return swapCount;
	}

	/**
	 * Konstruktor. Kopiert das übergebene Array.
	 * 
	 * @param array
	 */
	public Sortable(T[] array) {
		this.array = array.clone();
	}

	/** @return Länge der Sequenz. */
	public int length() {
		return array.length;
	}

	/**
	 * Vergleicht zwei Werte aus der Sequenz.
	 * 
	 * @param index1
	 *            Index des ersten Wertes (0-basiert)
	 * @param index2
	 *            Index des zweiten Wertes (0-basiert)
	 * @return
	 */
	public boolean lessOrEqual(int index1, int index2) {
		compareCount++;
		return array[index1].compareTo(array[index2]) <= 0;
	}

	public boolean less(int index1, int index2) {
		compareCount++;
		return array[index1].compareTo(array[index2]) < 0;
	}

	public boolean greaterOrEqual(int index1, int index2) {
		compareCount++;
		return array[index1].compareTo(array[index2]) >= 0;
	}

	public boolean greater(int index1, int index2) {
		compareCount++;
		return array[index1].compareTo(array[index2]) > 0;
	}

	public void swap(int index1, int index2) {
		T tmp = array[index1];
		array[index1] = array[index2];
		array[index2] = tmp;
		swapCount++;
	}

	public boolean isSorted() {
		for (int i = 1; i < array.length; i++) {
			if (array[i - 1].compareTo(array[i]) > 0) {
				return false;
			}
		}
		return true;
	}

	@Override
	public String toString() {
		if (length() <= 25) {
			return "[" + StringUtils.join(array, ",") + "]";
		} else {
			return "[" + StringUtils.join(array, ",", 0, 6) + ",...,"
					+ StringUtils.join(array, ",", length() - 6, length()) + "]";
		}

	}

}
