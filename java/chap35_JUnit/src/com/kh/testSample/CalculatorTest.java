package com.kh.testSample;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.kh.testSample.BF.Calculator;

public class CalculatorTest {

		@Test   // @ = Annotation (������̼�)
		public void testAddition() {
			Calculator cal = new Calculator();
			int result = cal.add(5, 8);
			assertEquals(13, result); // ���󰪰� ���� ����� ��
	}
		@Test
		public void testSubtraction() {
			Calculator cal = new Calculator();
			int result = cal.subtract(10, 5);
			assertEquals(5, result);
		}

}
