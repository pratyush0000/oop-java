package Lab3;

import java.util.*;
class Q1 {
    /*bubble sort*/
    public static void sort(int[] arr, int n)
    {   int temp;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<(n-i-1);j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void sort(int[] arr, int n, boolean x)
    {   int temp;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<(n-i-1);j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        if(x)
        {
            int i=0;
            int j=n-1;

            while(i<j)
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
    }

    public static void sort(String[] arr, int n)
    {   String temp;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<(n-i-1);j++)
            {
                if(arr[j].compareTo(arr[j+1])>0)
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        int[] arr=new int[n];
        String[] arr1=new String[n+1];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        sort(arr,n);
        System.out.println("forward sort : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

        sort(arr,n,true);
        System.out.println("");
        System.out.println("reverse sort : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        Scanner sc1=new Scanner(System.in);
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc1.nextLine();
        }

        sort(arr1,n);

        System.out.println("string sort  ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr1[i]+" ");
        }


    }
}
