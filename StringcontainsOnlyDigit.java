package Exampla4;

import java.util.Scanner;
// Write a Java program to check if a given string contains only digits.

public class StringcontainsOnlyDigit {
	public static void main(String[] args) {
		String str;
//		boolean b;
		System.out.println("enter the string ");
		Scanner sc =new Scanner(System.in);
		str = sc.next();
//		b = str.matches("\\d+");
//		if(b)
		if(str.matches("\\d+"))
		{
			System.out.println("The string contains only digit");
		}
		else
		{
			System.out.println("The string does not contains only digit ");
		}

	}
}
