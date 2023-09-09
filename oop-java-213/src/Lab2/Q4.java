package Lab2;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter the interest rate ");
        double r= input.nextDouble();
        System.out.println("Enter the years ");
        int y= input.nextInt();
        System.out.println("Enter the principal ");
        double p= input.nextDouble();

        double m=(p*r)/1-(1/Math.pow((1+r),y*12));

        System.out.println("Payment is : "+m%.2f);



    }
}
