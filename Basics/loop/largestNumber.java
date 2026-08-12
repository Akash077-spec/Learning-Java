package Basics.loop;

import java.util.Scanner;

public class largestNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int largestNumber = sc.nextInt();

        for (int i = 2; i <= 5; i++) {

            System.out.print("Enter number " + i + ": ");
            int num = sc.nextInt();

            if (num > largestNumber) {
                largestNumber = num;
            }
        }

        System.out.println("Largest number is: " + largestNumber);

        sc.close();
    }
}