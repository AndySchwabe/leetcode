package com.ts.problems.easy.rotatearray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RotateArrayTest {

	@Test
	protected void array1ShouldRotate1() {
		int[] testActual;
		int[] testExpected = new int[7];
		int[] inputInts = new int[7];
		int inputSteps;

		inputInts[0] = 1;
		inputInts[1] = 2;
		inputInts[2] = 3;
		inputInts[3] = 4;
		inputInts[4] = 5;
		inputInts[5] = 6;
		inputInts[6] = 7;

		inputSteps = 1;

		testExpected[0] = 7;
		testExpected[1] = 1;
		testExpected[2] = 2;
		testExpected[3] = 3;
		testExpected[4] = 4;
		testExpected[5] = 5;
		testExpected[6] = 6;

		RotateArray tester = new RotateArray();

		testActual = tester.rotate(inputInts, inputSteps);

		Assertions.assertArrayEquals(testExpected, testActual);
	}

	@Test
	protected void array1ShouldRotate2() {
		int[] testActual;
		int[] testExpected = new int[7];
		int[] inputInts = new int[7];
		int inputSteps;

		inputInts[0] = 1;
		inputInts[1] = 2;
		inputInts[2] = 3;
		inputInts[3] = 4;
		inputInts[4] = 5;
		inputInts[5] = 6;
		inputInts[6] = 7;

		inputSteps = 2;

		testExpected[0] = 6;
		testExpected[1] = 7;
		testExpected[2] = 1;
		testExpected[3] = 2;
		testExpected[4] = 3;
		testExpected[5] = 4;
		testExpected[6] = 5;

		RotateArray tester = new RotateArray();

		testActual = tester.rotate(inputInts, inputSteps);

		Assertions.assertArrayEquals(testExpected, testActual);
	}

	@Test
	protected void array1ShouldRotate3() {
		int[] testActual;
		int[] testExpected = new int[7];
		int[] inputInts = new int[7];
		int inputSteps;

		inputInts[0] = 1;
		inputInts[1] = 2;
		inputInts[2] = 3;
		inputInts[3] = 4;
		inputInts[4] = 5;
		inputInts[5] = 6;
		inputInts[6] = 7;

		inputSteps = 3;

		testExpected[0] = 5;
		testExpected[1] = 6;
		testExpected[2] = 7;
		testExpected[3] = 1;
		testExpected[4] = 2;
		testExpected[5] = 3;
		testExpected[6] = 4;

		RotateArray tester = new RotateArray();

		testActual = tester.rotate(inputInts, inputSteps);

		Assertions.assertArrayEquals(testExpected, testActual);
	}

	@Test
	protected void array2ShouldRotate1() {
		int[] testActual;
		int[] testExpected = new int[4];
		int[] inputInts = new int[4];
		int inputSteps;

		inputInts[0] = -1;
		inputInts[1] = -100;
		inputInts[2] = 3;
		inputInts[3] = 99;

		inputSteps = 1;

		testExpected[0] = 99;
		testExpected[1] = -1;
		testExpected[2] = -100;
		testExpected[3] = 3;

		RotateArray tester = new RotateArray();

		testActual = tester.rotate(inputInts, inputSteps);

		Assertions.assertArrayEquals(testExpected, testActual);
	}

	@Test
	protected void array2ShouldRotate2() {
		int[] testActual;
		int[] testExpected = new int[4];
		int[] inputInts = new int[4];
		int inputSteps;

		inputInts[0] = -1;
		inputInts[1] = -100;
		inputInts[2] = 3;
		inputInts[3] = 99;

		inputSteps = 2;


		testExpected[0] = 3;
		testExpected[1] = 99;
		testExpected[2] = -1;
		testExpected[3] = -100;

		RotateArray tester = new RotateArray();

		testActual = tester.rotate(inputInts, inputSteps);

		Assertions.assertArrayEquals(testExpected, testActual);
	}

	@Test
	protected void array3ShouldRotate2() {
		int[] testActual;
		int[] testExpected = new int[3];
		int[] inputInts = new int[1];
		int inputSteps;

		inputInts[0] = -1;

		inputSteps = 2;

		testExpected[0] = 0;
		testExpected[1] = 0;
		testExpected[2] = -1;

		RotateArray tester = new RotateArray();

		testActual = tester.rotate(inputInts, inputSteps);

		Assertions.assertArrayEquals(testExpected, testActual);
	}
}
