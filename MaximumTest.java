package com.Bridgelabz.Generic;

public class MaximumTest {
		String x, y, z;
	
	public MaximumTest(String x, String y, String z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public String maximum() {
		return MaximumTest.maximum(x, y, z);
	}
	
	public static String maximum(String x, String y, String z) {
		String max = x;
		if(y.compareTo(max)>0) {
			max = y;
		}
		if(z.compareTo(max)>0) {
			max = z;
		}
		printMax(x, y, z, max);
		return max;
	}
	
	public static String testMaximum(String x, String y, String z) {
		String max = x;
		if(y.compareTo(max)>0) {
			max = y;
		}
		if(z.compareTo(max)>0) {
			max = z;
		}
		printMax(x, y, z, max);
		return max;
	}
	
	public static void printMax(String x, String y, String z, String max) {
		System.out.println(x +" "+ y +" "+ z + "\nMaximum no is : "+ max);
	}
	
	public static void main(String[] args) {
		String xStr = "Pear", yStr = "Apple", zStr = "Orange";
		
		MaximumTest.testMaximum(xStr, yStr, zStr);
		new MaximumTest(xStr, yStr, zStr).maximum();
	}
}
