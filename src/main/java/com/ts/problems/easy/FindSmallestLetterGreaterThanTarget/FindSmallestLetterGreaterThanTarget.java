package com.ts.problems.easy.FindSmallestLetterGreaterThanTarget;

import java.util.ArrayList;

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
