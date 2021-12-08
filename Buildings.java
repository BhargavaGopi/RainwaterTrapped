package Buildwater;

import java.util.Scanner;


public class Buildings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = in.nextInt();
        int[] arr=new int[n];
        for(int i = 0; i <n; i++)
        {
            System.out.print("Enter element " + (i+1) + ":");
            arr[i]=in.nextInt();
        }
        int[] maxr = new int[n];
        for(int i =0; i< arr.length; i++) {
            maxr[i] = arr[i];
            for(int j = i; j< arr.length; j++)
            {
               if(arr[j]>maxr[i])
               {
                   maxr[i]=arr[j];
               }
            }

        }
        int[] maxl = new int[n];
        for(int i = arr.length-1; i>=0; i--)
        {
            maxl[i] = arr[i];
            for( int j= i; j >=0; j--)
            {
                if(arr[j] > maxl[i])
                {
                    maxl[i]=arr[j];
                }
            }
        }
        water(maxr, maxl, arr);


    }
    public static void water(int[] maxr, int[] maxl, int[] arr)
    {
        int totalwater=0;
        for(int i = 0; i<arr.length; i++)
        {
                int collectedwater = Math.min(maxl[i], maxr[i]) - arr[i];
                totalwater = totalwater + collectedwater;
        }
        System.out.println("Total water collected is " + totalwater + " units");
    }
}
