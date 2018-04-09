package hm.edu.cs.algdat.disjointset;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import hm.edu.cs.algdat.disjointset.MyDisjointIntegerSets;

/**
 * Testklasse für die Klasse {@link MyDisjointIntegerSets}.
 * 
 * @author katz.bastian
 */
public class MyDisjointIntegerSetsTest {

	private static final int TEST_SIZE = 5;

	private DisjointIntegerSets sut;

	@Before
	public void init() {
		sut = new MyDisjointIntegerSets(TEST_SIZE);
	}

	/**
	 * Testet, dass initial alle Zahlen einzelne Gruppen bilden, d.h. jede Zahl
	 * sein eigener Repräsentant ist.
	 */
	@Test
	public void testInitialState() {
		for (int i = 0; i < TEST_SIZE; i++) {
			Assert.assertEquals(i, sut.find(i));
		}
	}

	/**
	 * Testet, dass initial die Größe stimmt.
	 */
	@Test
	public void testSize() {
		for (int i = 0; i < TEST_SIZE; i++) {
			Assert.assertEquals(TEST_SIZE, sut.size());
		}
	}

	
	/**
	 * Testet die Ermittlung der Repr�sentanten nach teilweisem Verschmelzen.
	 */
	@Test
	public void testPartiallyMerged() {
		sut.union(4, 2);
		sut.union(1, 4);
		sut.union(3, 0);
		Assert.assertEquals(1, sut.find(2));
		Assert.assertEquals(0, sut.find(0));
		Assert.assertEquals(0, sut.find(3));
	}

	/**
	 * Testet die Ermittlung der Repr�sentanten nach vollst�ndigem Verschmelzen.
	 */
	@Test
	public void testMergedAll() {
		sut.union(0, 3);
		sut.union(1, 4);
		sut.union(2, 0);
		sut.union(3, 4);
		for (int i = 0; i < 5; i++) {
			Assert.assertEquals(0, sut.find(0));
		}
	}

}
