package Exampla4;

import java.util.Scanner;
//Write a Java program to find the index of the first occurrence of a given substring in a string
public class IndexFirstOccurenceSubString {
	public static void main(String[] args) {
		String str,subString;
		int index;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string ");
		str = sc.nextLine();
		System.out.println("Enter the subString to search for");

		subString =sc.nextLine();
		index = str.indexOf(subString);
		if (index != -1)
		{
			System.out.println("The  substring is found at index " +index);
		}
		else
		{
			System.out.println("The substring is not found in the main string");
		}


	}
}
