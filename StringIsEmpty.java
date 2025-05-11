package Exampla4;

import java.util.Scanner;
// Write a Java program to check if a given string is empty.

public class StringIsEmpty {
	public static void main(String[] args) {
		String str ;
		System.out.println("enter the string");
		Scanner sc = new Scanner(System.in);
		str = sc.next();
		if(str.isEmpty())
		{
			System.out.println("string is empty");
		}
		else
			System.out.println("string is not empty");
	}
}
