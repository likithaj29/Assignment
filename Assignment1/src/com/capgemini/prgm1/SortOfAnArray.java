package com.capgemini.prgm1;

public class SortOfAnArray {
	public static void main(String[] args) {
		int arr[]= {7,8,4,2,0,1};
		int temp = 0;
		System.out.println("Elements of given array:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("\nElements of array sorted in ascending order:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
