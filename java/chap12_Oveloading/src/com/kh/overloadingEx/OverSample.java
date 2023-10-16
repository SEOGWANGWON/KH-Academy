package com.kh.overloadingEx;

public class OverSample {
	public int Math(int a, int b, int c, int d) {
		return a+b+c+d;
	}
	public int Math(int a, int b) {
		return a*b;
		
	}
	public double Math(double a, double b, double c) {
		return a+b+c;
	}
	public float Math(float a, float b) {
		return a / b;
		
	}
	public double Math(double a, double b) {
		return a/b;
	}
	public char Math(char a, char b) {
		return 'a'+'b';
	}
	

	
}
