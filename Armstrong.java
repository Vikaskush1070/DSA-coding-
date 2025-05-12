package Exampla.Example2;
import java.util.Scanner;
public class Armstrong {
	public static void main(String[] args) {
		int n,temp,rem,arm=0;
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		temp = n;
		while(n>0)
		{
			rem = n%10;
			arm=(rem*rem*rem)+arm;
			n = n/10;

		}
		if(temp==arm)
		{
			System.out.println("Armstrong");
		}
			else
			System.out.println("Not Armstrong");

	}
}
