package hm.edu.cs.algdat.disjointset;

/**
 * Implementierung von {@link DisjointIntegerSets}.
 * 
 * @author katz.bastian
 */
public class MyDisjointIntegerSets implements DisjointIntegerSets {

	/**
	 * Erzeugt eine Disjoint-Set Datenstruktur für die Zahlen 0 bis size-1.
	 * Initial repräsentiert jede Zahl sich selbst, d.h. es gibt size
	 * einelementige Mengen.
	 * 
	 * @param size
	 *            Größe der Datenstruktur, d.h. Anzahl der Elemente
	 */
	public MyDisjointIntegerSets(int size) {
		//TODO: Konstruktor ergänzen
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hm.edu.cs.algdat.disjointset.DisjointIntegerSet#find(int)
	 */
	@Override
	public int find(int a) {
		//TODO: Repräsentanten finden/zurückgeben		
		return 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hm.edu.cs.algdat.disjointset.DisjointIntegerSet#union(int, int)
	 */
	@Override
	public void union(int a, int b) {
		//TODO: Datenstruktur aktualisieren!
	}

	@Override
	public int size() {
		//TODO: Länge zurückgeben
		return 0;
	}
}