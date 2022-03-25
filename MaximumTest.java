package com.Bridgelabz.Generic;

public class MaximumTest<T extends Comparable<T>> {
		T x, y, z;
	
	public MaximumTest(T x, T y, T z) {
		//super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public T maximum() {
		return MaximumTest.maximum(x, y, z);
	}
	
	public static <T extends Comparable<T>>T maximum(T x, T y, T z) {
		T max = x;
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
	
	public static <T> void printMax(T x, T y, T z, T max) {
		System.out.println(x +" "+ y +" "+ z + "\nMaximum no is : "+ max);
	}
	
	public static void main(String[] args) {
		Integer xInt = 2, yInt = 4, zInt = 7;
		Float xFlt = 1.1f, yFlt = 2.2f, zFlt = 3.3f;
		String xStr = "Parrot", yStr = "Peacoke", zStr ="Cat";
		
		MaximumTest.testMaximum(xStr, yStr, zStr);
		System.out.println("---------------------");
		new MaximumTest(xInt, yInt, zInt).maximum();
		System.out.println("----------------------");
		new MaximumTest(xFlt, yFlt, zFlt).maximum();
		System.out.println("-----------------------");
		new MaximumTest(xStr, yStr, zStr).maximum();
	}
}
