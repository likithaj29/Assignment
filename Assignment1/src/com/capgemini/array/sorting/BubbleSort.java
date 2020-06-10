package com.capgemini.array.sorting;

import java.util.Scanner;

public class BubbleSort {
	static void displayArrayElements(int[] arr) {
		for(int i : arr) {
			System.out.println(i);
		}
	}
	public static void performBubbleSort(int[] a) {
		 for(int i=0;i<a.length;i++) {
			 for(int j=0;j<a.length-1;j++) {
				 if(a[j] > a[i]) {
					 int temp = a[i];
					 a[i] =a[j];
					 a[j] =temp;
				 }
			 }
		 }
	}
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	 System.out.println("Enter No of Elements to be Inserted");
	 int[] a=new int[sc.nextInt()];
	 
	 System.out.println("Enter "+a.length+" Elements");
	 for(int i=0; i<a.length;i++) {
		 a[i]=sc.nextInt();
		 
	 }
	 sc.close();
	 
	 System.out.print("Before Sorting ");
	 displayArrayElements(a);
	 
	 performBubbleSort(a);
	 
	 System.out.print("After sorting");
	 displayArrayElements(a);
}
}
