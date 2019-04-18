/**
 *
 */

package com.ts.problems.easy.reverseinteger;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReverseIntegerTest {
	
	@Test
	protected void largeIntShouldOverflow() {
		int testActual;
		int testExpected;
		int inputValue;

		inputValue = 2147483647;
		testExpected = 0;

		ReverseInteger tester = new ReverseInteger();

		testActual = tester.reverse(inputValue);

		Assertions.assertEquals(testExpected, testActual);
	}
	
	@Test
	protected void intShouldBeReversed() {
		int testActual;
		int testExpected;
		int inputValue;

		inputValue = 123;
		testExpected = 321;

		ReverseInteger tester = new ReverseInteger();

		testActual = tester.reverse(inputValue);

		Assertions.assertEquals(testExpected, testActual);
	}
	
	@Test
	protected void negativeShouldBeReversed() {
		int testActual;
		int testExpected;
		int inputValue;
		
		inputValue = -123;
		testExpected = -321;
		
		ReverseInteger tester = new ReverseInteger();

		testActual = tester.reverse(inputValue);

		Assertions.assertEquals(testExpected, testActual);
	}
}
