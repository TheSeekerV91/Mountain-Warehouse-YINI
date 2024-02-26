package com.mountainwarehouse;

public class Challenge_2 {
	/**
	 * During your time at mountain warehouse you will often have to go bug fix your
	 * own (and other peoples!) code. The following method should return the
	 * smallest value in the given array. If the array is empty then it should
	 * return 0. However, the last dev has made some bugs. It seems it only works
	 * when the number "1" is the smallest value in the array - for all other cases
	 * the method fails 4 bugs have been identified within the code. See if you can
	 * find them all!
	 * 
	 * @param numbers A list of numbers.
	 * @return Return the minimum value in the list.
	 */
	public static int returnSmallestValueInArray(int[] numbers) {
		if (numbers.length != 0) {
			int min = numbers[0];
			for (int number : numbers) {
				if (number < min) {
					min = number;
				}
			}
			return min;
		} else {
			return 0;
		}

	}
}