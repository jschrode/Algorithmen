package hm.edu.cs.algdat.bigoh;

import static org.junit.Assert.*;
import org.junit.Test;

public class IntArrayUtilTest {

	@Test
	public void testUnsorted() {
		int[] unsorted1 = { 2, 9, 5, 6, 17, 11 };
		int[] unsorted2 = { 17, 1, 100, 5 };
		assertEquals(2, IntArrayUtil.countIntersectionUnsorted(unsorted1, unsorted2));
	}

	@Test
	public void testOneInputSorted() {
		int[] sorted = { 1, 5, 6, 12, 13 };
		int[] unsorted = { 2, 9, 6, 5, 1, 11 };
		assertEquals(3, IntArrayUtil.countIntersectionOneInputSorted(unsorted, sorted));
	}

	@Test
	public void testSorted() {
		int[] sorted1 = { 1, 2, 5, 6, 9, 11 };
		int[] sorted2 = { 1, 5, 6, 12, 13 };
		assertEquals(3, IntArrayUtil.countIntersectionSorted(sorted1, sorted2));
	}
}
