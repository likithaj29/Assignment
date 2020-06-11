package com.capgemini.string.reverseofString;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintProgramC {
	

	private static void reverseString(String str) {

		str = str + " ";

		ArrayList<String> wordsList = new ArrayList<String>();
		char alphabet[] = str.toCharArray();
		String word = "";
		for (int i = 0; i < alphabet.length; i++) {
			if (alphabet[i] != ' ') {
				word = word + alphabet[i];
			} else {
				wordsList.add(word);
				word = "";
			}
		}
		int num = 0;
		char revWord[];
		for (String str1 : wordsList) {
			if (num % 2 == 0) {
				String rWord = "";
				revWord = str1.toCharArray();
				for (int i = revWord.length - 1; i >= 0; i--) {
					rWord = rWord + revWord[i];
				}
				str1 = rWord;
			}
			System.out.print(str1 + " ");
			num++;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = null;

		System.out.print("Input -");
		str = sc.nextLine();
       System.out.print("Output -");
		reverseString(str);

		sc.close();

	}


}
