package Exampla.Example2;

import java.util.Scanner;

public class UniqueArray {
    public static void main(String[] args) {
        System.out.println("enter the  array size");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans =-1;
        int arr[] = new int[n];
        System.out.println("enter the array element");
        for (int i=0; i< n;i++)
        {
            arr[i] = sc.nextInt();
        }
//        int ans =-1;
        for (int i=0;i<n;i++)
        {
            for (int j= i+1; j<n;j++)
            {
                if (arr[i] == arr[j])
                {
                    arr[i] = -1;
                    arr[j] = -1;

                }
            }
        }
        System.out.println("find the unique");
        for (int i =0;i<n;i++){
            if (arr[i] > 0){
                ans = arr[i];
            }
        }
        System.out.println("unique number" +ans);
    }
}
