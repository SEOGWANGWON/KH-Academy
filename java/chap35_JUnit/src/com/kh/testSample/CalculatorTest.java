package com.kh.testSample;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.kh.testSample.BF.Calculator;

public class CalculatorTest {

		@Test   // @ = Annotation (어노테이션)
		public void testAddition() {
			Calculator cal = new Calculator();
			int result = cal.add(5, 8);
			assertEquals(13, result); // 예상값과 실제 결과값 비교
	}
		@Test
		public void testSubtraction() {
			Calculator cal = new Calculator();
			int result = cal.subtract(10, 5);
			assertEquals(5, result);
		}

}
