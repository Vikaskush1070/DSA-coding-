package Exampla4;
import java.util.Scanner;
//Write a Java program to find the number of occurrences of a given character in a string
public class NumberOfOccurenceString {
	public static void main(String[] args) {
		String str;
		char ch;
		int count = 0;
		System.out.println("enter the string ");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		System.out.println("Enter a character to find:");
		ch = sc.next().charAt(0);
		for (int i = 0;i<str.length();i++)
		{
			if (str.charAt(i) == ch)
			{
				count++;
			}
		}
		System.out.println("The character " + ch + " occurs " + count + " times in the string.");

	}
}
