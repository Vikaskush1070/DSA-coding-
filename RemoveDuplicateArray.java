package Exampla.Example2;
import java.util.Scanner;
public class RemoveDuplicateArray {
	public static void main(String[] args) {
		int size;
		System.out.println("Enter the array size ");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("enter array element");
		for(int i = 0;i<size;i++)
		{
			arr[i] =sc.nextInt();
		}
		for(int i= 0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i] == arr[j])
				{
					arr[j]=0;
				}}}
		System.out.println("Remove duplicate array");
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i] != 0)
			{
				System.out.println(arr[i]+ " ");
			}
		}
	}
}
