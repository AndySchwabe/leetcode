/**
 *
 */

package com.ts.problems.easy.twosum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TwoSumTest{
	
	@Test
	protected void resultShouldBeCorrect() {
		int[] values = new int[4];
		int[] testActual;
		int[] testExpected = new int[2];
		int targetValue;

		values[0] = 2;
		values[1] = 7;
		values[2] = 11;
		values[3] = 15;

		testExpected[0] = 0;
		testExpected[1] = 1;
		
		targetValue = 9;

		TwoSum tester = new TwoSum();

		testActual = tester.twoSum(values,targetValue);

		Assertions.assertArrayEquals(testExpected, testActual);
	}
	
	@Test
	protected void intShouldBeUsedOnce() {
		int[] values = new int[4];
		int[] testActual;
		int[] testExpected = new int[2];
		int targetValue;
		
		values[0] = 3;
		values[1] = 4;
		values[2] = 2;
		values[3] = 1;

		testExpected[0] = 1;
		testExpected[1] = 2;
		
		targetValue = 6;

		TwoSum tester = new TwoSum();
		
		testActual = tester.twoSum(values,targetValue);

		Assertions.assertArrayEquals(testExpected, testActual);
	}
}

