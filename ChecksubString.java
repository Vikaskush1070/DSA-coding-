package Exampla4;
import java.util.Scanner;
//Write a Java program to check if a given string contains a given substring.
public class ChecksubString {
	public static void main(String[] args) {
		String str;
		String subString;
		boolean b;
		System.out.println("enter the string ");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		System.out.println("Enter the substring to search for:");
		subString = sc.nextLine();
		b = str.contains(subString);
		if (b)
		{
			System.out.println("The string is substring");
		}
		else {
			System.out.println("The string is not the substring");
		}
	}
}
