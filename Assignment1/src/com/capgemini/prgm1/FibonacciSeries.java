package com.capgemini.prgm1;

public class FibonacciSeries {
	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 1;
		System.out.println(n1);
		System.out.println(n2);
		for (int num = 1; num <= 10; num++) {
			int n3 = n1 + n2;
			System.out.print(n3+",");
			n1 = n2;
			n2 = n3;
		}
	}

}
