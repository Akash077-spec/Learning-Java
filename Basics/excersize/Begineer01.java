package Basics.excersize;

import java.util.Scanner;

public class Begineer01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Unit consumed");
        int unit = sc.nextInt();
        final float cost = 7.0f;
        float total = cost * unit;
        System.out.println("\n===== ELECTRICITY BILL =====");
        System.out.println("Customer Name : " + name);
        System.out.println("Units :" + unit);
        System.out.println("Total Bill :" + total);

    }
}
