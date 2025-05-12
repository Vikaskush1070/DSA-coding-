package Exampla.Example2;
import java.util.Scanner;
public class LinearSearch {
	public static void main(String[] args) {
		int num,terget,index;
		System.out.println("enter the size array");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		int arr[] = new int[num];
		System.out.println("enter the element");
		for (int i = 0; i<num; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("enter the element to search");
		terget = sc.nextInt();
		index = -1;
		for (int i=0;i<num;i++)
		{
			if (arr[i] == terget)
			{
				index = i;
				break;
			}}
		System.out.println("Element found at index: " + index);
//		System.out.println(index);
	}
}
