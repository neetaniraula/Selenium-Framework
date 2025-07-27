package com.dsa;

import org.checkerframework.checker.index.qual.SameLen;import org.checkerframework.checker.units.qual.min;

public class SmallNumArray {

	public static void main(String[] args) {
		
	int [] my_arr = {56,7,43,3,87};
	int minValue = my_arr[0];
	
	for(int i : my_arr) {
		if(i < minValue) {
			minValue =i;
		}
	}
	System.out.println(minValue);
		
		
	}

}
