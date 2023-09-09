package Lab2;

import java.util.Scanner;

public class Q2 {
    public static boolean checkp(int num)
    {
        int n=(int)Math.pow(num,0.5)+1;

        int i=2;
        while(i<=n)
        {
            if(num%i==0)
            {
                return false;
            }
            i++;
        }

        return true;


    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n= input.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(checkp(arr[i]))
            {
                System.out.println("number is prime  "+arr[i]);
            }
        }


    }
}
