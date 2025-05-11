package Exampla4;

import java.util.Scanner;
// Write a Java program to check if a given string contains only letters.
public class StringcontainsOnlyLetter {
	public static void main(String[] args) {
		String str;
//		boolean isOnlyLetter;
		System.out.println("enter the string ");
		Scanner sc = new Scanner(System.in);
		str = sc.next();
//		isOnlyLetter = str.matches("[a-zA-Z]+");
//		if(isOnlyLetter)
		if(str.matches("[a-zA-Z]+"))
		{
			System.out.println("The string contains only letters.");
		}
		else
		{
			System.out.println("The string does not contains only letters.");
		}
	}
}
