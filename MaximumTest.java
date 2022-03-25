package com.Bridgelabz.Generic;

public class MaximumTest {
		Integer x, y, z;
	
	public MaximumTest(Integer x, Integer y, Integer z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Integer maximum() {
		return MaximumTest.maximum(x, y, z);
	}
	
	public static Integer maximum(Integer x, Integer y, Integer z) {
		Integer max = x;
		if(y.compareTo(max)>0) {
			max = y;
		}
		if(z.compareTo(max)>0) {
			max = z;
		}
		printMax(x, y, z, max);
		return max;
	}
	
	public static Integer testMaximum(Integer x, Integer y, Integer z) {
		Integer max = x;
		if(y.compareTo(max)>0) {
			max = y;
		}
		if(z.compareTo(max)>0) {
			max = z;
		}
		printMax(x, y, z, max);
		return max;
	}
	
	public static void printMax(Integer x, Integer y, Integer z, Integer max) {
		System.out.println(x +" "+ y +" "+ z + "\nMaximum no is : "+ max);
	}
	
	public static void main(String[] args) {
		Integer xInt = 3, yInt = 6, zInt = 5;
		
		MaximumTest.testMaximum(xInt, yInt, zInt);
		new MaximumTest(xInt, yInt, zInt).maximum();
	}
}
