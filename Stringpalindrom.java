package Exampla4;
import java.util.Scanner;
//Write a Java program to check if a given string is a palindrome
public class Stringpalindrom {
	public static void main(String[] args) {
		String str,rev;
		System.out.println("enter the string ");
		Scanner sc =new Scanner(System.in);
		str = sc.nextLine();
		rev = " ";
		for (int i = str.length()-1; i >= 0; i--)
		{
			rev = rev+str.charAt(i);
		}
		if (rev.equals(str))
		{
			System.out.println("string is palondrom");
		}
		else
		{
			System.out.println("string is not palindrom");
		}
	}
}
