package Exampla.Example2;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		int n,term,a=0,b=1,c;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		term = n;
		for(int i=1;i<=term;i++)
		{
			System.out.print(a + " ");
			c = a+b;
			a = b;
			b = c;
		}

	}
}
