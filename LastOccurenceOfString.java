package Exampla4;

import java.util.Scanner;
//Write a Java program to find the index of the last occurrence of a given character in a string
public class LastOccurenceOfString {
	public static void main(String[] args) {
		String str;
		char ch;
		int index;
		System.out.println("enter the string ");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		System.out.println("Enter a character to find");
		ch = sc.next().charAt(0);
		index = str.lastIndexOf(ch);
		if (index != -1)
		{
			System.out.println("The Last occurrence of the character " + ch + " is at index: " + index);
		}
		else
		{
			System.out.println("The character " + ch + " is not found in the string.");
		}

	}
}
