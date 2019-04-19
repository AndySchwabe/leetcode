/**
 * https://leetcode.com/problems/two-sum/ 
 * Runtime: 34 ms, faster than 18.85% of Java online submissions for Two Sum.
 * Memory Usage: 38.5 MB, less than 44.70% of Java online submissions for Two Sum.
 */

package com.ts.problems.easy.twosum;

class TwoSum {
	protected int[] twoSum(int[] nums, int target) {
		int solution[] = new int[2]; // array of ints to return
		
		for (int i = 0; i < nums.length; i++) {
			int result; // int to hold result of subtraction

			// subtract the target from one of the options
			result = (target - nums[i]);

			// loop through all options to see if the result of the subtraction matches
			for (int j = 0; j < nums.length; j++) {
				// if it matches and it's not because we're subtracting half of the number and matching ourselves
				if ((result == nums[j]) && (i != j)) {
					// place results in int array
					solution[0] = j;
					solution[1] = i;
				}
			}
		}
		return solution;
	}
}
