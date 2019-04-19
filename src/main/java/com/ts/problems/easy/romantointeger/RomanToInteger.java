/**
 * https://leetcode.com/problems/roman-to-integer
 * Runtime: 10 ms, faster than 75.00% of Java online submissions for Roman to Integer.
 * Memory Usage: 42.6 MB, less than 5.05% of Java online submissions for Roman to Integer.
 */

package com.ts.problems.easy.romantointeger;

import java.util.HashMap;
import java.util.ArrayList;

public class RomanToInteger {
	protected int romanToInt(String s) {
		ArrayList<String> resultArrayList = new ArrayList<String>();
		int result;
		String[] inputArray; // array to store chars in
		result = 0;

		HashMap<String, Integer> map = new HashMap<>();

		map.put("I", 1);
		map.put("V", 5);
		map.put("X", 10);
		map.put("L", 50);
		map.put("C", 100);
		map.put("D", 500);
		map.put("M", 1000);

		for (int i = 0; i < s.length(); i++) {
			String num1;
			String num2;
			int val1;
			int val2;
			int number;

			if (i != s.length()-1) {
				num1 = s.substring(i, (i+1));
				num2 = s.substring(i+1, (i+2));
				val1 = map.get(num1);
				val2 = map.get(num2);
			
				if (val1 < val2) {
					number = val2 - val1;
					i++;
				} else {
					number = val1;
				}
			}
			else{
				num1 = s.substring(i, (i+1));

				val1 = map.get(num1);
				number = val1;
			}
			resultArrayList.add(Integer.toString(number));
		}
		
		for (String num : resultArrayList) {
			result += Integer.parseInt(num);
		}
		
		return result;
	}
}
