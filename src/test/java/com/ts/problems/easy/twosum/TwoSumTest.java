/**
 *
 */

package com.ts.problems.easy.twosum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TwoSumTest{
	
	@Test
	protected void intShouldBeUsedOnce() {

		int[] values = new int[4];
		int[] testActual;
		int[] testExpected = {1,2};
		int targetValue;
		
		values[0] = 3;
		values[1] = 4;
		values[2] = 2;
		values[3] = 1;

		targetValue = 6;

		TwoSum tester = new TwoSum();
		
		testActual = tester.twoSum(values,targetValue);

		Assertions.assertArrayEquals(testExpected, testActual);
	}
}

