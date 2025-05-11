package Exampla4;
import java.util.Scanner;
//Write a Java program to find the number of consonants in a given string.
public class FindConsonantString {
	public static void main(String[] args) {
		String str;
		char ch;
		int ConsoCount =0;
		System.out.println("enter the string ");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		str = str.toLowerCase();

		for (int i = 0 ;i <str.length();i++ )
		{
			ch = str.charAt(i);
			if(ch >= 'a' && ch <= 'z' && !(ch =='a' || ch == 'e' ||ch == 'i' ||ch =='o'|| ch == 'u'))
			{
				ConsoCount++;
			}
		}
		System.out.println("The number of consonants in the string is: " +ConsoCount);
	}
}
