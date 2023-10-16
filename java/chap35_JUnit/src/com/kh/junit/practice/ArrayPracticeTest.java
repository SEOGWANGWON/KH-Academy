package com.kh.junit.practice;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayPracticeTest {
	private ArrayPractice arrp;
	@Test
	public void testPractice1() {
		
		int[] expected = {1,2,3,4,5,6,7,8,9,10};
		int[] actual = {1,2,3,4,5,6,7,8,9,10};
		assertArrayEquals(expected, actual);
		
	}
	
	@Test
	public void testPractice2() {
		int[] expected = {10,9,8,7,6,5,4,3,2,1};
		int[] actual = {0,1,2,3,4,5,6,7,8,9};
		assertEquals(expected, actual);
	}
	
	@Test
	public void testPractice3() {
		
	}

}
