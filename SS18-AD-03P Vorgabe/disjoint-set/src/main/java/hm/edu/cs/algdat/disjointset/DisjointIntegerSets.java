package hm.edu.cs.algdat.disjointset;

/**
 * Interface für Disjoint-Sets-Datenstruktur für Ganzzahlen in einem
 * vorgegebenen Wertebereich von 0 bis size-1.
 * 
 * @author katz.bastian
 */
public interface DisjointIntegerSets {

	/**
	 * @return liefert die Anzahl der verwalteten Zahlen zurück.
	 */
	int size();

	/**
	 * Liefert zur Zahl a die kleinste Zahl, die in derselben Gruppe ist wie a
	 * 
	 * @param a
	 *            Eingabe
	 * @return Kleinste Zahl (Repräsentant) in der Gruppe von a.
	 */
	int find(int a);

	/**
	 * Verschmilzt die Mengen, die a und b enthalten, so dass nach der Operation
	 * die Repräsentationen von allen Knoten mit denselben Repräsentanten wie a
	 * oder b denselben Repräsentanten haben.
	 * 
	 * @param a
	 *            verwaltete Zahl
	 * @param b
	 *            verwaltete Zahl
	 */
	void union(int a, int b);

}