package com.capgemini.string.reverseofString;

import java.util.Scanner;

public class PrintProgramB {


	private static void findEachWordLength(String str) {
		str = str + " ";
		char character[] = str.toCharArray();
		int count = 0;
		String str1 = "";
		for (int i = 0; i < character.length; i++) {
			if (character[i] != ' ') {
				count++;
				str1 = str1 + character[i];
			} else {
				System.out.print(str1 + "" + count + " ");
				str1 = "";
				count = 0;
			}
		}

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = null;
		System.out.print("Input-");
		str = sc.nextLine();
        System.out.print("Output-");
		findEachWordLength(str);

		sc.close();

	}

}
