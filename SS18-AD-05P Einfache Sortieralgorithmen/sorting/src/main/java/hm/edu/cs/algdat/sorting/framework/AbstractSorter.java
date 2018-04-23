package hm.edu.cs.algdat.sorting.framework;

import java.text.MessageFormat;

/**
 * Abstrakte Klasse für die Überwachung von Sortieralgorithmen. Kapselt das
 * übergebene Array (als Kopie) in einem {@link Sortable}, das den direkten
 * Zugriff auf die enthaltenen Werte unterbinden. Stößt die Sortierung an und
 * gibt die Ausführungsstatistik (Vergleiche und Swaps) der SOrtierung aus.
 * 
 * @author katz.bastian
 *
 */
public abstract class AbstractSorter {

	public final <T extends Comparable<T>> boolean sort(final T[] array) {
		Sortable<T> sortable = new Sortable<>(array);
		String vorher = sortable.toString();
		long start = System.currentTimeMillis();
		sort(sortable);
		long end = System.currentTimeMillis();

		if (sortable.isSorted()) {
			String pattern = "  " + this.getClass().getSimpleName()
					+ " hat {0} Vergleiche und {1} Vertauschungen in {2}ms durchgefuehrt.";
			System.out.println(
					MessageFormat.format(pattern, sortable.getCompareCount(), sortable.getSwapCount(), end - start));
		} else {
			System.out.println("  " + this.getClass().getSimpleName() + " hat die Eingabe nicht sortiert!!!");
		}
		System.out.println("    Eingabe der Sortierung war  " + vorher + ".");
		System.out.println("    Ergebnis der Sortierung war " + sortable + ".");
		return sortable.isSorted();
	}

	protected abstract <T extends Comparable<T>> void sort(Sortable<T> input);
}
