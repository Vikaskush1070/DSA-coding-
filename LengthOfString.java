package Exampla4;

import java.util.Scanner;

// Write a Java program to find the length of a given string.

public class LengthOfString {
	public static void main(String[] args) {
		String str;
		int length;
		System.out.println("enter the string");
		Scanner sc = new Scanner(System.in);
		str = sc.next();
		length = str.length();
		{
			System.out.println("the length of string " +length);
		}
	}
}
