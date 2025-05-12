package Exampla.Example2;

import java.util.Scanner;

public class AscendingOrder {
	public static void main(String[] args) {
		int size;
		System.out.println("enter the size");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("enter the element");
		for(int i = 0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
		for (int i=0 ;i<size;i++)
		{
			for (int j =i+1;j<size;j++)
			{
				if (arr[i] > arr[j])
				{
					int temp =arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}}}
		for (int i=0 ; i<size ; i++)
		{
			System.out.println(arr[i]);
		}
	}
}
