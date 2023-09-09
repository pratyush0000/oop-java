package PracLab1;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the number to find out the factorial :");
        int fact = num.nextInt();
        int ans=1;
        for (int i=1;i<=fact; i++){
            ans=ans*i;
        }
        System.out.println("The factorial is: "+ans);
    }

}
