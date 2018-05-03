package hm.edu.cs.algdat.rekursion;

import org.junit.Assert;
import org.junit.Test;



public class DynamicProgrammingTest {

	private static final int[] TEST = {2,8,4,2,7,5,3,1,1,9,5,7};
	private static final int[] EMPTY = {};
	private static final int[] SHORT = {4,3,2,1};
	@Test
	public void testDemoRecursive() {
		int result = DynamicProgramming.maxSumWithDistanceRecursive(DynamicProgramming.DEMO, 3);
		Assert.assertEquals(10, result);
	}
	
	@Test
	public void testDemoDynamic() {
		int result = DynamicProgramming.maxSumWithDistanceDynamic(DynamicProgramming.DEMO, 3);
		Assert.assertEquals(10, result);
	}
	
	@Test
	public void testDemoRecursive2() {
		int result = DynamicProgramming.maxSumWithDistanceRecursive(TEST, 3);
		Assert.assertEquals(24, result);
	}
	
	@Test
	public void testDemoDynamic2() {
		int result = DynamicProgramming.maxSumWithDistanceDynamic(TEST, 3);
		Assert.assertEquals(24, result);
	}
	
	@Test
	public void testDemoRecursiveEmpty() {
		int result = DynamicProgramming.maxSumWithDistanceRecursive(EMPTY, 2);
		Assert.assertEquals(0, result);
	}
	
	@Test
	public void testDemoDynamicEmpty() {
		int result = DynamicProgramming.maxSumWithDistanceDynamic(EMPTY, 2);
		Assert.assertEquals(0, result);
	}
	@Test
	public void testDemoRecursiveShort() {
		int result = DynamicProgramming.maxSumWithDistanceRecursive(SHORT, 6);
		Assert.assertEquals(4, result);
	}
	
	@Test
	public void testDemoDynamicShort() {
		int result = DynamicProgramming.maxSumWithDistanceDynamic(SHORT, 5);
		Assert.assertEquals(4, result);
	}
}
