package com.ts.problems.easy.rotatearray;

public class RotateArray {
	protected int[] rotate(int[] nums, int k) {
		int result[];
		if (k > nums.length) {
			result = new int[nums.length + k];
		}
		else {
			result = new int[nums.length];
		}

		for (int i = 0; i < nums.length; i++) {
			if (result.length > nums.length) {
				result[(i + k)] = nums[i];
			}
			else if (i + k >= nums.length) {
				result[((i + k) - nums.length)] = nums[i];
			}
			else {
				result[(i + k)] = nums[i];
			}
		}
		return result;
	}
}
