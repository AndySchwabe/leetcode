/**
 * https://leetcode.com/problems/palindrome-number/
 * Runtime: 10 ms, faster than 80.59% of Java online submissions for Palindrome Number.
 * Memory Usage: 35.8 MB, less than 100.00% of Java online submissions for Palindrome Number.
 */

package com.ts.problems.easy.palindromenumber;

class PalindromeNumber {
	protected boolean isPalindrome(int x) {
		boolean result;
		String inputString; // string to store casted int in
		String[] inputArray; // array to store chars in
		result = false; //guilty until proven innocent
		
		inputString = Integer.toString(x);
		
		inputArray = new String[inputString.length()];
		
		for (int i = 0; i < inputString.length(); i++) {
			inputArray[i] = inputString.substring(i, (i+1));
		}
		
		for (int j = 0; j < inputArray.length; j++) {
			if (inputArray[j].equals(inputArray[((inputArray.length - j) - 1)])) {
				result = true;
			}
			else{
				result = false;
				break;
			}
		}
		
		return result;
	}
}
