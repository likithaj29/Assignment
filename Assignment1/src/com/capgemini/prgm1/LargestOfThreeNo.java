package com.capgemini.prgm1;

public class LargestOfThreeNo {
	public static int getThirdLargest(int[] a, int total) {
		int temp;
		for (int i = 0; i < total; i++) {
			for (int j = 0; j < total; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}
		}
		return a[total-3];

	}
	public static void main(String[] args) {
		int a[]= {1,2,5,4,3,8};
		System.out.println("Third Largest:"+getThirdLargest(a,6));
	}

}
