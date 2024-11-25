package com.tap.project;

import java.util.Scanner;
public class CharacterFrequency {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s=scan.next();
		characterFrequency(s);
	}
	
	public static void characterFrequency(String s) {
	    int[] res = new int[256]; 
	     
	     for (int i = 0; i < s.length(); i++) {
	         char ch = s.charAt(i);
	        res[ch]++;
	     }
	     
	     System.out.println("Character frequencies:");
	     
	     for (int i = 0; i < s.length(); i++) {
	         char ch = s.charAt(i);
	         if (res[ch] != 0) { 
	             System.out.println(ch + ": " + res[ch]);
	             res[ch]=0;
	         }
	     }
	}
}
