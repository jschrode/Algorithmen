package hm.edu.cs.algdat.rekursion;

import org.junit.Assert;
import org.junit.Test;

public class RekursionTest {

	@Test
	public void testPalindromIterativePositive1() {
		Assert.assertEquals(true, Rekursion.isPalindromeIterative("Anna"));
	}

	@Test
	public void testPalindromIterativePositive2() {
		Assert.assertEquals(true, Rekursion.isPalindromeIterative("Regallager"));
	}

	@Test
	public void testPalindromIterativePositiveUngerade() {
		Assert.assertEquals(true, Rekursion.isPalindromeIterative("AxUXa"));
	}

	@Test
	public void testPalindromIterativeEmpty() {
		Assert.assertEquals(true, Rekursion.isPalindromeIterative(""));
	}
	
	@Test
	public void testPalindromIterativeSingle() {
		Assert.assertEquals(true, Rekursion.isPalindromeIterative("x"));
	}
	
	@Test
	public void testKeinPalindromIterative() {
		Assert.assertEquals(false, Rekursion.isPalindromeIterative("Rewallager"));
	}

	@Test
	public void testPalindromRecursivePositive1() {
		Assert.assertEquals(true, Rekursion.isPalindromeRecursive("Anna"));
	}

	@Test
	public void testPalindromRecursivePositive2() {
		Assert.assertEquals(true, Rekursion.isPalindromeRecursive("Regallager"));
	}

	@Test
	public void testPalindromRecursivePositiveUngerade() {
		Assert.assertEquals(true, Rekursion.isPalindromeRecursive("AxUXa"));
	}

	@Test
	public void testKeinPalindromRecursive() {
		Assert.assertEquals(false, Rekursion.isPalindromeRecursive("Rewallager"));
	}
	
	@Test
	public void testPalindromRecursiveEmpty() {
		Assert.assertEquals(true, Rekursion.isPalindromeRecursive(""));
	}
	
	@Test
	public void testPalindromRecursiveSingle() {
		Assert.assertEquals(true, Rekursion.isPalindromeRecursive("x"));
	}
	
}
