package Exampla.Example2;
import java.util.Scanner;
public class selectionSort {
	public static void main(String[] args) {
		int size , temp;
		System.out.println("enter the array size");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("enter the element ");
		for(int i = 0; i< arr.length;i++)
		{
			arr[i] =sc.nextInt();
		}
		System.out.println("after sorting array");
		for (int i =0; i< arr.length;i++)
		{
			for(int j = i+1; j< arr.length;j++)
			{
				if(arr[i] > arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}}}
		for (int i =0; i<arr.length;i++)
		{
			System.out.println(arr[i]+ " ");
		}
	}
}
