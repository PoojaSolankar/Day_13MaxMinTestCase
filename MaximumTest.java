package com.Bridgelabz.Generic;

public class MaximumTest {
		Float x, y, z;
	
	public MaximumTest(Float x, Float y, Float z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Float maximum() {
		return MaximumTest.maximum(x, y, z);
	}
	
	public static Float maximum(Float x, Float y, Float z) {
		Float max = x;
		if(y.compareTo(max)>0) {
			max = y;
		}
		if(z.compareTo(max)>0) {
			max = z;
		}
		printMax(x, y, z, max);
		return max;
	}
	
	public static Float testMaximum(Float x, Float y, Float z) {
		Float max = x;
		if(y.compareTo(max)>0) {
			max = y;
		}
		if(z.compareTo(max)>0) {
			max = z;
		}
		printMax(x, y, z, max);
		return max;
	}
	
	public static void printMax(Float x, Float y, Float z, Float max) {
		System.out.println(x +" "+ y +" "+ z + "\nMaximum no is : "+ max);
	}
	
	public static void main(String[] args) {
		Float xFl = 3.3f, yFl = 6.6f, zFl = 5.5f;
		
		MaximumTest.testMaximum(xFl, yFl, zFl);
		new MaximumTest(xFl, yFl, zFl).maximum();
	}
}
