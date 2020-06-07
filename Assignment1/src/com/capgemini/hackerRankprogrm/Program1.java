package com.capgemini.hackerRankprogrm;

import java.util.Arrays;

public class Program1 {
	static boolean isAnagram(String a, String b) {
        String s1 = a.replaceAll("\\s", "");  
       String s2 = b.replaceAll("\\s", "");  
       boolean status = true;  
       if (s1.length() != s2.length()) {  
           status = false;  
       } else {  
           char[] ArrayS1 = s1.toLowerCase().toCharArray();  
           char[] ArrayS2 = s2.toLowerCase().toCharArray();  
           Arrays.sort(ArrayS1);  
           Arrays.sort(ArrayS2);  
           status = Arrays.equals(ArrayS1, ArrayS2);  
       }  
       if (status) {  
           System.out.println(s1 + " and " + s2 + " are anagrams");  
       } else {  
           System.out.println(s1 + " and " + s2 + " are not anagrams");  
       }  
	return status;
   }

}
