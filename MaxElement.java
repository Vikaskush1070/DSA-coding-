package Exampla.Example2;

import java.util.Scanner;

public class MaxElement {
	public static void main(String[] args) {
		int size,max;
		System.out.println("enter the size of array");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		int list[] = new int[size];
		System.out.println("enter element");
		for(int i=0;i<size;i++)
		{
			list[i] = sc.nextInt();
		}
		max = list[0];
		System.out.println("after enter elememt");
		for(int i=0;i<size;i++)
		{
			if(max < list[i])
//			if(list[i] > max)   
//			if (> list[i])
			{
				max = list[i];
			}
		}
		System.out.println("largest element is " +max);
	}
}
