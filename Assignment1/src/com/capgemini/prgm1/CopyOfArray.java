package com.capgemini.prgm1;

public class CopyOfArray {
	public static void main(String[] args) {
		int a1[] = {1,2,3};
		int b1[] = new int[a1.length];
		b1 = a1;
		b1[0]++;
		System.out.println("elements of a1[]:");
		for(int i=0;i<a1.length;i++) {
			System.out.print(a1[i]+" ");
		}
		System.out.println("\nelements of b1[]:");
		for(int i=0;i<b1.length;i++) {
			System.out.print(b1[i]+" ");
		}
		
	}

}
