package com.day3;
public class AlphaPyramid {
public static void main(String[] args) {
		int s = 35;
		for(int i=97; i<=107; i++) {
			for(int j=0; j<s; j++) System.out.print(" ");
			for(int j=97; j<i; j++) System.out.print((char)j);
			for(int j=i-2; j>=97; j--) System.out.print((char)j);
			System.out.println();
			s--;
		}
		System.out.println();
		int n = new Integer(25);
		Integer in = 25;
		long number = 2534533443332334L;
		float deci = 33.45F;
		
	}

}
OUTPUT:
                                  a
                                 aba
                                abcba
                               abcdcba
                              abcdedcba
                             abcdefedcba
                            abcdefgfedcba
                           abcdefghgfedcba
                          abcdefghihgfedcba
                         abcdefghijihgfedcba

