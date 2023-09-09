package Lab2;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n= input.nextInt();
        int x;
        int max=0;
        for(int i=0;i<n;i++)
        {
             x= input.nextInt();
            if(x>=max)
            {
                max=x;
            }
        }

        System.out.println("the max number is  "+max);
    }
}
