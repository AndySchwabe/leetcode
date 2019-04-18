/**
 *
 */

package com.ts.problems.easy.palindromenumber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PalindromeNumberTest {

	@Test
	protected void intShouldBePalindrome() {
		boolean testActual;
		boolean testExpected;
		int inputValue;

		inputValue = 121;
		testExpected = true;

		PalindromeNumber tester = new PalindromeNumber();

		testActual = tester.isPalindrome(inputValue);

		Assertions.assertEquals(testExpected, testActual);
	}

	@Test
	protected void negativeIntShouldNotBePalindrome() {
		boolean testActual;
		boolean testExpected;
		int inputValue;

		inputValue = -121;
		testExpected = false;

		PalindromeNumber tester = new PalindromeNumber();

		testActual = tester.isPalindrome(inputValue);

		Assertions.assertEquals(testExpected, testActual);
	}

	@Test
	protected void shortIntShouldNotBePalindrome() {
		boolean testActual;
		boolean testExpected;
		int inputValue;

		inputValue = 10;
		testExpected = false;

		PalindromeNumber tester = new PalindromeNumber();

		testActual = tester.isPalindrome(inputValue);

		Assertions.assertEquals(testExpected, testActual);
	}
}
