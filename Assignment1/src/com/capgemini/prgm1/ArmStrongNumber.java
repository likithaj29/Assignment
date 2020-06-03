package com.capgemini.prgm1;

import java.util.Scanner;

public class ArmStrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		int temp = num;
		int rem = 0;
		int sum = 0;
		int len = (num + "").length();

		while (num != 0) {
			rem = num % 10;
			sum = sum + (int) Math.pow(rem, len);
			num = num / 10;
		}
		if (temp == sum) {
			System.out.println(temp + " is a ArmStrong number");
		} else {
			System.out.println(temp + " is not a ArmStrong number");
		}
	}

}
