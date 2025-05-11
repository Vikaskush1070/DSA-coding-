package Exampla4;
import java.util.Scanner;
// Write a Java program to find the number of vowels in a given string.
public class FindVowelString {
	public static void main(String[] args) {
		String str;
		char ch=0;
		int vowelCount = 0;
		int index;
		System.out.println("enter the string");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		str = str.toLowerCase();

		for (int i = 0;i < str.length(); i++)
		{
			ch = str.charAt(i);
			if (ch == 'a'|| ch == 'e'||ch == 'i'||ch == 'o'|| ch == 'u')
			{
				vowelCount++;
			}
		}

		System.out.println("The number of vowels in the string is: " + vowelCount);

	}
}
