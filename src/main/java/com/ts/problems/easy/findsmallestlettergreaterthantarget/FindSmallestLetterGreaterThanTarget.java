/**
 * https://leetcode.com/problems/find-smallest-letter-greater-than-target/
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Find Smallest Letter Greater Than Target.
 * Memory Usage: 39.9 MB, less than 57.07% of Java online submissions for Find Smallest Letter Greater Than Target.
 */

package com.ts.problems.easy.findsmallestlettergreaterthantarget;

class FindSmallestLetterGreaterThanTarget {
	protected char nextGreatestLetter(char[] letters, char target) {
		char result;
		boolean noResult;
		noResult = true;

		result = 'a';

		for (char letter : letters) {
			if (letter > target) {
				result = letter;
				noResult = false;
				break;
			}
		}

		if (noResult == true) {
			result = letters[0];
		}

		return result;
	}
}
