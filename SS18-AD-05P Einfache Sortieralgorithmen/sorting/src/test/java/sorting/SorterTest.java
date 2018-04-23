package sorting;

import org.junit.Assert;
import org.junit.Test;

import hm.edu.cs.algdat.sorting.TestDataFactory;
import hm.edu.cs.algdat.sorting.sorters.BubbleSorter;
import hm.edu.cs.algdat.sorting.sorters.GnomeSorter;
import hm.edu.cs.algdat.sorting.sorters.InsertionSorter;
import hm.edu.cs.algdat.sorting.sorters.SelectionSorter;

public class SorterTest {

	@Test
	public void testGnome() {
		Assert.assertTrue(new GnomeSorter().sort(TestDataFactory.createRandomArray(50)));
	}

	@Test
	public void testInsertion() {
		Assert.assertTrue(new InsertionSorter().sort(TestDataFactory.createRandomArray(50)));
	}

	@Test
	public void testSelection() {
		Assert.assertTrue(new SelectionSorter().sort(TestDataFactory.createRandomArray(50)));
	}
	
	@Test
	public void testBubble() {
		Assert.assertTrue(new BubbleSorter().sort(TestDataFactory.createRandomArray(50)));
	}

	
	
}
