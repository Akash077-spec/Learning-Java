package Basics.MixedQuestion;

import java.util.Scanner;

public class MixedQuestion5 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num = sc.nextInt();

        int reverse = 0;

        while (num != 0) {

            int digit = num % 10;              // Get last digit
            reverse = reverse * 10 + digit;    // Add digit to reverse
            num = num / 10;                    // Remove last digit
        }

        System.out.println("Reversed number is : " + reverse);

        sc.close();
    }
}