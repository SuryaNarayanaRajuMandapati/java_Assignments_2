package com.strings;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String s1 = "cat";
		String s2 = "act";
		
		if(s1.length() == s2.length()) {
			char [] ch1 = s1.toCharArray();
			char [] ch2 = s2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			boolean status = true;
			
			for(int i=0; i<s1.length(); i++) {
				if(ch1[i] != ch2[i]) {
					status = false;
					break;
				}
			}
			
			if(status) {
				System.out.println("Anagram");
			}
			else {
				System.out.println("Not an Anagram.");
			}
		}
		else {
			System.out.println("Not an Anagram.");
		}
	}
}
