/**
 * https://leetcode.com/problems/two-sum/ 
 * Runtime: 74 ms, faster than 5.03% of Java online submissions for Two Sum.
 * Memory Usage: 38.4 MB, less than 52.65% of Java online submissions for Two Sum.
 */

class Solution {
	public int[] twoSum(int[] nums, int target) {
		int solution[] = new int[2]; // array of ints to return

		// label allowing us to exit top loop
		outerloop: 
		for (int i = 0; i < nums.length; i++) {
			int result; // int to hold result of subtraction

			// subtract the target from one of the options
			result = (target - nums[i]);

			// loop through all options to see if the result of the subtraction matches
			for (int j = 0; j < nums.length; j++) {
				// if it matches and it's not because we're subtracting half of the number and matching ourselves
				if ((result == nums[j]) && (i != j)) {
					// place results in int array
					solution[0] = i;
					solution[1] = j;
					// kill the loop via the label
					break outerloop;
				}
			}
		}
		return solution;
	}
}
