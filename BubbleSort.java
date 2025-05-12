package Exampla.Example2;
import java.util.Scanner;
public class BubbleSort {
	public static void main(String[] args) {
		int size,temp;
		System.out.println("enter the array size");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("enter the element");
		for (int i=0;i< arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("after sorted element");
		for (int i=0;i< arr.length;i++)
		{
			for (int j=0;j< arr.length-i-1;j++)
			{
				if (arr[j] > arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}}}
		for (int i=0 ;i<arr.length;i++)
		{
			System.out.println("sorted element" +arr[i]);
//			System.out.println(arr[i]);
		}
	}
}
