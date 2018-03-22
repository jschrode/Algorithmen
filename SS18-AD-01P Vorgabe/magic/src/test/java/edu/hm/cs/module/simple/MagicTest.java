package edu.hm.cs.module.simple;

import org.junit.Test;
import static org.junit.Assert.*;

public class MagicTest {

	@Test
	public void testWithZeros() {
		assertEquals(0, Magic.magic(0, 0));
	}

	@Test
	public void testFirstArgumentZero() {
		assertEquals(9, Magic.magic(0, 9));
	}

	@Test
	public void testSecondArgumentZero() {
		assertEquals(9, Magic.magic(9, 0));
	}

	@Test
	public void testStandardExample() {
		assertEquals(6, Magic.magic(312, 210));
	}
	
	@Test
	public void testStandardExampleFirstSmaller() {
		assertEquals(6, Magic.magic(210, 312));
	}
	
	@Test
	public void testExample() {
		assertEquals(4, Magic.magic(12, 16));
	}
		
}
