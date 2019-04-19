/**
 * https://leetcode.com/problems/reverse-integer/ 
 * Runtime: 5 ms, faster than 78.97% of Java online submissions for Reverse Integer. 
 * Memory Usage: 34.1 MB, less than 100.00% of Java online submissions for Reverse Integer.
 */

package com.ts.problems.easy.reverseinteger;

import java.util.Arrays;
import java.util.Collections;

class ReverseInteger {
	protected int reverse(int x) {
		String xstring; // string to store casted int in
		String[] xarray; // array to store chars in
		String xreversedstring; // string to store flipped string array in
		int xreversed; // return variable
		byte negativeByte; // quick bool for identifying polarity

		// initialize as positive
		negativeByte = 0;

		// cast int to string
		xstring = Integer.toString(x);

		// create array with enough indicies to store all our chars
		xarray = new String[(xstring.length())];

		// loop through the string
		for (int i = 0; i < (xstring.length()); i++) {
			// pull off each char and insert into array
			xarray[i] = xstring.substring(i, (i + 1));
		}

		// reverse the array
		Collections.reverse(Arrays.asList(xarray));

		// check polarity, string.equals is important here. string == "-" doesn't work
		// so hot
		if (xarray[xarray.length - 1].equals("-")) {
			// remove negative sign if it exists
			xarray[xarray.length - 1] = "";

			// set polarity bool
			negativeByte = 1;
		}

		// concat array back together into a standard string
		xreversedstring = String.join("", xarray);

		try {
			// cast string back to int
			xreversed = Integer.parseInt(xreversedstring);
		}
		// catch when flipped string overflows int size
		catch (Exception NumberFormatException) {
			// set to 0 per requirements
			xreversed = 0;
		}

		// check to see if we need to adjust polarity
		if (negativeByte == 1) {
			// make this int a negative
			xreversed = -xreversed;
		}
		return xreversed;
	}
}
