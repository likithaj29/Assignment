package com.capgemini.prgm1;

public class DuplicateElementOfAnArray {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,3,8,5};
		System.out.println("Duplicate elements of given array:");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j])
					System.out.print(arr[j]+" ");
				
			}
			
		}
	}

}
