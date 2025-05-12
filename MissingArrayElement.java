package Exampla.Example2;
import java.util.Scanner;
public class MissingArrayElement {
	public static void main(String[] args) {
		int n,sum;
		System.out.println("Enter the array number");
		Scanner sc= new Scanner(System.in);
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter element");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		    sum=(n*(n+1)/2);
		for(int i = 0;i<arr.length-1;i++)
		{
			sum = sum - arr[i];
		}
		System.out.println("Missing number" +sum);
	}
}
