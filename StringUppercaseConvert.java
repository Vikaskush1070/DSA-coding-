package Exampla4;

import java.util.Scanner;

//. Write a Java program to convert a given string to uppercase.

public class StringUppercaseConvert {
	public static void main(String[] args) {
		String str;
		System.out.println("enter the string ");
		Scanner sc = new Scanner(System.in);
		str = sc.next();
		str = str.toUpperCase();
//		String string = str.toUpperCase();

			System.out.println("string is uppercase convert " +str );

	}
}
