package Basics.excersize;

import java.util.Scanner;

public class Begineer02 {
    // Time converter
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("======Time Converter=====");
        System.out.println("Enter Total  minutes : ");
        int total = sc.nextInt();
        int hours = total / 60;
        int remainingMinutes = total % 60;
        System.out.println("Hours : " + hours);
        System.out.println("RemainSig minutes : " + remainingMinutes);
        sc.close();

    }
}
