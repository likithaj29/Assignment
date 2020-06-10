package com.capgemini.string.reverseofString;

import java.util.Scanner;

public class ReverseOfString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		String s1=sc.nextLine();
		System.out.println("Before Reversing :"+s1);
		
		System.out.print("After reversing : ");
		for (int i = s1.length() - 1; i >= 0; i--) {
			System.out.print(s1.charAt(i));
		}
		
	}	
}
