package Exampla4;

import java.util.Scanner;
//Write a Java program to convert a given string to lowercase.


public class StringLowercaseConvert {
	public static void main(String[] args) {
		String str;
		System.out.println("enter the string ");
		Scanner sc = new Scanner(System.in);
		str = sc.next();
		str = str.toLowerCase();
		System.out.println("string is convert lower case " +str);
	}
}
