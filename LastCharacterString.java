package Exampla4;

import java.util.Scanner;
//Write a Java program to find the last character of a given string
public class LastCharacterString {
	public static void main(String[] args) {
		String str;
		char laststring;
		System.out.println("enter the string ");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		if (!str.isEmpty())
		{
			laststring = str.charAt(str.length()-1);
			System.out.println("The last character of the string is " + laststring);
		}
		else
			System.out.println("The string is empty");
	}

}
