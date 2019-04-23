package com.ts.problems.easy.findsmallestlettergreaterthantarget;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindSmallestLetterGreaterThanTargetTest {
	@Test
	protected void resultShouldBeC() {
		char testActual;
		char testExpected;
		char[] inputLetters = new char[3];
		char inputTarget;

		inputLetters[0] = 'c';
		inputLetters[1] = 'f';
		inputLetters[2] = 'j';

		inputTarget = 'a';
		testExpected = 'c';

		FindSmallestLetterGreaterThanTarget tester = new FindSmallestLetterGreaterThanTarget();

		testActual = tester.nextGreatestLetter(inputLetters, inputTarget);

		Assertions.assertEquals(testExpected, testActual);
	}

	@Test
	protected void resultShouldBeF() {
		char testActual;
		char testExpected;
		char[] inputLetters = new char[3];
		char inputTarget;

		inputLetters[0] = 'c';
		inputLetters[1] = 'f';
		inputLetters[2] = 'j';

		inputTarget = 'c';
		testExpected = 'f';

		FindSmallestLetterGreaterThanTarget tester = new FindSmallestLetterGreaterThanTarget();

		testActual = tester.nextGreatestLetter(inputLetters, inputTarget);

		Assertions.assertEquals(testExpected, testActual);
	}

	@Test
	protected void resultShouldBeF1() {
		char testActual;
		char testExpected;
		char[] inputLetters = new char[3];
		char inputTarget;

		inputLetters[0] = 'c';
		inputLetters[1] = 'f';
		inputLetters[2] = 'j';

		inputTarget = 'd';
		testExpected = 'f';

		FindSmallestLetterGreaterThanTarget tester = new FindSmallestLetterGreaterThanTarget();

		testActual = tester.nextGreatestLetter(inputLetters, inputTarget);

		Assertions.assertEquals(testExpected, testActual);
	}

	@Test
	protected void resultShouldBeJ() {
		char testActual;
		char testExpected;
		char[] inputLetters = new char[3];
		char inputTarget;

		inputLetters[0] = 'c';
		inputLetters[1] = 'f';
		inputLetters[2] = 'j';

		inputTarget = 'g';
		testExpected = 'j';

		FindSmallestLetterGreaterThanTarget tester = new FindSmallestLetterGreaterThanTarget();

		testActual = tester.nextGreatestLetter(inputLetters, inputTarget);

		Assertions.assertEquals(testExpected, testActual);
	}

	@Test
	protected void resultShouldBeC1() {
		char testActual;
		char testExpected;
		char[] inputLetters = new char[3];
		char inputTarget;

		inputLetters[0] = 'c';
		inputLetters[1] = 'f';
		inputLetters[2] = 'j';

		inputTarget = 'j';
		testExpected = 'c';

		FindSmallestLetterGreaterThanTarget tester = new FindSmallestLetterGreaterThanTarget();

		testActual = tester.nextGreatestLetter(inputLetters, inputTarget);

		Assertions.assertEquals(testExpected, testActual);
	}

	@Test
	protected void resultShouldBeC2() {
		char testActual;
		char testExpected;
		char[] inputLetters = new char[3];
		char inputTarget;

		inputLetters[0] = 'c';
		inputLetters[1] = 'f';
		inputLetters[2] = 'j';

		inputTarget = 'k';
		testExpected = 'c';

		FindSmallestLetterGreaterThanTarget tester = new FindSmallestLetterGreaterThanTarget();

		testActual = tester.nextGreatestLetter(inputLetters, inputTarget);

		Assertions.assertEquals(testExpected, testActual);
	}
}
