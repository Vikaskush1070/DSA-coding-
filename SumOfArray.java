package Exampla.Example2;

import java.util.Scanner;

public class SumOfArray {
	public static void main(String[] args) {
		int size, sum=0;
		System.out.println("enter the array size");
		Scanner sc = new Scanner(System.in);
		size =sc.nextInt();
		int arr[] = new int[size];
		System.out.println("enter the element");
		for (int i=0 ;i< arr.length;i++)
		{
			arr[i] =sc.nextInt();
		}
		for (int i =0;i< arr.length;i++)
		{
			sum = sum+arr[i];
		}
		System.out.println("total sum of array" + sum);
	}
}
