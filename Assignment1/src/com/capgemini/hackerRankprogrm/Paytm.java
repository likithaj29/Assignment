package com.capgemini.hackerRankprogrm;

public class Paytm {
	IRCTC i1;
	Paytm(IRCTC a1){
		i1=a1;
	}
	void BooktrainTicket(String src,String des) {
		i1.BookTicket(src,des);
	}

}
