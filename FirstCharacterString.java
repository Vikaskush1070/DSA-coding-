package Exampla4;

import java.util.Scanner;
//Write a Java program to find the first character of a given string.
public class FirstCharacterString {
	public static void main(String[] args) {
		String str;
		char fich;
		System.out.println("enter tne string ");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		if(!str.isEmpty())
		{
			fich = str.charAt(0);
			System.out.println("The first character of the string is " + fich);
		}
		else
		{
			System.out.println("The string is empty");
		}
	}
}
