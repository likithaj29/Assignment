package com.capgemini.hackerRankprogrm;

public class MainPaytm {
	public static void main(String[] args) {
		IRCTC i=new IRCTC();
		Paytm p1=new Paytm(i);
		p1.BooktrainTicket("Bangalore","Chennai");
	}

}
