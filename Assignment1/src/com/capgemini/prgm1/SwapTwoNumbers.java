package com.capgemini.prgm1;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		System.out.println("enter the value of x and y");
		int x=23;
		int y=25;
		System.out.println("before swapping :"+x+" "+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After swapping:"+x+" "+y);
	}

}
