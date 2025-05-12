package Exampla.Example2;
import java.util.Scanner;
public class SecondLargestNumberArray {
	public static void main(String[] args) {
		int size;
		System.out.println("enter the size ");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the elements of the array:");
		for(int i=0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i=0;i< arr.length;i++)
		{
			for(int j=i+1;j< arr.length;j++)
			{
				if(arr[i] > arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}}}
		System.out.println("second largest number" +arr[size-2]);
//		System.out.println("second smalest number" +arr[1]);
	}
}
