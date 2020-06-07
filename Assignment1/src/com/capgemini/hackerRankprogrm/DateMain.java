package com.capgemini.hackerRankprogrm;

public class DateMain {

	public static void main(String[] args) {
		Date d1=new Date(29,5,1996);
		Date d2=new Date(5,11,2019);
		int days=d2.noOfDays()-d1.noOfDays();
		System.out.println(days);
		
	}
}
