package hm.edu.cs.algdat.disjointset;


/**
 * Implementierung von {@link DisjointIntegerSets}.
 * 
 * @author katz.bastian, schrode@hm.edu
 */
public class MyDisjointIntegerSets implements DisjointIntegerSets {

	private int size = 0;
	private int[] set;

	/**
	 * Erzeugt eine Disjoint-Set Datenstruktur für die Zahlen 0 bis size-1.
	 * Initial repräsentiert jede Zahl sich selbst, d.h. es gibt size
	 * einelementige Mengen.
	 * 
	 * @param size
	 *            Größe der Datenstruktur, d.h. Anzahl der Elemente
	 */
	public MyDisjointIntegerSets(int size) {
		this.size = size;
		set = new int[size];
		for (int i = 0; i < size; i++) {
			set[i] = i;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hm.edu.cs.algdat.disjointset.DisjointIntegerSet#find(int)
	 */
	@Override
	public int find(int a) {		
		return set[a];
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hm.edu.cs.algdat.disjointset.DisjointIntegerSet#union(int, int)
	 */
	@Override
	public void union(int a, int b) {
		if (set[a] < set[b]) {
			for (int i = 0; i < size; i++) {
				if (set[i] == set[b]) {
					set[i] = set[a];
				}
			}
		}
		else {
			for (int i = 0; i < size; i++) {
				if (set[i] == set[a]) {
					set[i] = set[b];
				}
			}
		}
	}

	@Override
	public int size() {
		return size;
	}
}