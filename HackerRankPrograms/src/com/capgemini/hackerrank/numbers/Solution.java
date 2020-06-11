package com.capgemini.hackerrank.numbers;

import java.util.Scanner;

public class Solution {
	public static void test(int n) {
		if(n%2==1 || ((n%2==0) && n>=6 && n<=20)){
			System.out.println("Weird");
		}else if((n%2==0  && n>20)||(n%2==0 && (n>=2 && n<=5))){
			System.out.println("Not Weird");
			
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		for(int i=1; i<=4;i++) {
			System.out.println("Enter Number :");
			int n=sc.nextInt();
			test(n);
			System.out.println("--------------");
		}
	}

}
