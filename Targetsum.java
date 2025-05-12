package Exampla.Example2;

import java.util.Scanner;

public class Targetsum {

//    public static void main(String[] args) {
//        System.out.println("enter the array size");
//        Scanner sc= new Scanner(System.in);
//        int n = sc.nextInt();
//        int arr[] = new int[n];
//        System.out.println("enter the array element");
//        for (int i=0; i< n;i++)
//        {
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("enter target sum");
//        int target = sc .nextInt();
//        int ans =0;
//        for (int i=0;i<n; i++)
//        {
//            for (int j=i+1; j<n; j++)
//            {
//                if (arr[i] +arr[j] == target){
//                    ans++;
//                }
//            }
//        }
//        System.out.println("number of pairs with target " + ans);
//
//    }

    static  int triple(int arr[] ,int target)
    {
        int n= arr.length;
        int ans =0;
        for (int i=0;i<n;i++)
        {
            for (int j=i+1;j<n;j++){
                if (arr[i] +arr[j] == target){
                    ans++;
                }
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size");

        int n = sc.nextInt();
        int arr[] =new int[n];
        System.out.println("enter element");
        for (int i =0 ;i<n ;i++)
        {
            arr[i] = sc.nextInt();

        }
        System.out.println("enter target number");
        int target = sc.nextInt();
        System.out.println(triple(arr,target));
    }
}
