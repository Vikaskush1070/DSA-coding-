package Exampla.Example2;

import java.util.Scanner;
public class ReverseArray {
	public static void main(String[] args) {
		int size;
		System.out.println("enter the size of array");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("enter the elemente");
		for(int i=0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("array in reverse ");
		{
			for (int i= arr.length-1;i>=0;i--){
				System.out.print(arr[i] + " ");
			}
		}
	}
}
