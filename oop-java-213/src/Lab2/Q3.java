package Lab2;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n= input.nextInt();

        for(int i=1;i<=n;i++)
        {
            if(i%15==0)
            {
                System.out.println("fizzbuzz  ");
            }

           else if(i%3==0)
            {
                System.out.println("fizz ");
            }
            else if(i%5==0)
            {
                System.out.println("buzz");
            }

            else
            {
                System.out.println(i);
            }


        }
    }
}
