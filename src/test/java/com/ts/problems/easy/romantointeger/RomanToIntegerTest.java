/**
 *
 */

package com.ts.problems.easy.romantointeger;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanToIntegerTest {

	@Test
	protected void resultShouldBe3() {
		int testActual;
		int testExpected;
		String inputValue;

		inputValue = "III";
		testExpected = 3;

		RomanToInteger tester = new RomanToInteger();

		testActual = tester.romanToInt(inputValue);

		Assertions.assertEquals(testExpected, testActual);
	}

	@Test
	protected void resultShouldBe4() {
		int testActual;
		int testExpected;
		String inputValue;

		inputValue = "IV";
		testExpected = 4;

		RomanToInteger tester = new RomanToInteger();

		testActual = tester.romanToInt(inputValue);

		Assertions.assertEquals(testExpected, testActual);
	}

	@Test
	protected void resultShouldBe9() {
		int testActual;
		int testExpected;
		String inputValue;

		inputValue = "IX";
		testExpected = 9;

		RomanToInteger tester = new RomanToInteger();

		testActual = tester.romanToInt(inputValue);

		Assertions.assertEquals(testExpected, testActual);
	}
	
	@Test
	protected void resultShouldBe58() {
		int testActual;
		int testExpected;
		String inputValue;

		inputValue = "LVIII";
		testExpected = 58;

		RomanToInteger tester = new RomanToInteger();

		testActual = tester.romanToInt(inputValue);

		Assertions.assertEquals(testExpected, testActual);
	}

	@Test
	protected void resultShouldBe1994() {
		int testActual;
		int testExpected;
		String inputValue;

		inputValue = "MCMXCIV";
		testExpected = 1994;

		RomanToInteger tester = new RomanToInteger();

		testActual = tester.romanToInt(inputValue);

		Assertions.assertEquals(testExpected, testActual);
	}
}
