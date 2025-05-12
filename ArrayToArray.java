package Exampla.Example2;

public class ArrayToArray {
	public static void main(String[] args) {
		int arr1[] = new int[]{2,5,36,9,7};
		int arr2[] = new int[arr1.length];
		for(int i=0;i<arr1.length;i++)
		{
			arr2[i] = arr1[i];
		}

		System.out.println("enter of original array");
		for(int i = 0;i<arr1.length;i++)
		{
			System.out.println(arr1[i] + " ");
		}

		System.out.println("element of new array");
		for (int i = 0; i < arr2.length; i++)
		{
			System.out.println(arr2[i] + " ");
		}
	}
}
