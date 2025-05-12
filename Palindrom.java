package Exampla.Example2;

import java.util.Scanner;

public class Palindrom {
	public static void main(String[] args) {
		int n,temp,rem,sum=0;
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		temp = n;
		while(n>0)
		{
			rem = n%10;
			sum = sum*10+rem;
			n = n/10;

		}
		if(temp == sum)
		{
			System.out.println("palindrom number");
		}
		else

			System.out.println(" not a palindrom number");

	}
}
