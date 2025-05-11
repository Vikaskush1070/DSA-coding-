package Exampla4;
import java.util.Scanner;
//Java program to find the duplicate characters in a string
public class DuplCharaString {
	public static void main(String[] args) {
		String str;
		int count;
		System.out.println("Enter the string ");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		char string[] = str.toLowerCase().toCharArray();
		System.out.println("Duplicate characters in the given string: ");
		for (int i = 0; i < string.length; i++)
		{
			count = 1;
			if (string[i] != ' ' && string[i] != '0')
				for (int j = i + 1; j < string.length; j++)
				{
					if (string[i] == string[j])
					{
						count++;
						string[j] = '0';
					}}
			if (count > 1)
				System.out.println(string[i] + "->" + count);
//			    System.out.println(string[i]);
	    }}}