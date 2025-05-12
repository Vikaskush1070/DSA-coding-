package Exampla.Example2;
import java.util.Scanner;
public class StringPalindrom {
	public static void main(String[] args) {
		String str,rev;
		System.out.println("enter string ");
		Scanner sc = new Scanner(System.in);
		str = sc.next();
		rev = " ";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev = rev+str.charAt(i);
		}
		if(rev.equals(str))
		{
			System.out.println("string is palondrom");
		}
		else
		{
			System.out.println("string is not palindrom");
		}
	}
}
