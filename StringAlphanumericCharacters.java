package Exampla4;

import java.util.Scanner;
//Write a Java program to check if a given string contains only alphanumeric characters
public class StringAlphanumericCharacters {
	public static void main(String[] args) {
		String str;
		System.out.println("enter the string");
		Scanner sc = new Scanner(System.in);
		str = sc.next();
//		boolean b = str.matches("[a-zA-Z0-9]+");
//		if(b)
		if(str.matches("[a-zA-Z0-9]+"))
		{
			System.out.println("The string contains only alphanumeric character");
		}
		else {
			System.out.println("The string does not contains only alphanumeric character");
		}
	}
}
