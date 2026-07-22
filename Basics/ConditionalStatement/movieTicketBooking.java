package Basics.ConditionalStatement;

import java.util.Scanner;

public class movieTicketBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("========Movie Ticket Booking System========");
        System.out.print("Enter you age : ");
        int age = sc.nextInt();
        sc.nextLine();
        if (age >= 18) {
            System.out.print("Do you have a valid card?(yes/no) : ");
            String hasValidCrd = sc.nextLine();
            if (hasValidCrd.equalsIgnoreCase("yes")) {
                System.out.print("Enter the number of ticket : ");
                int ticket = sc.nextInt();
                if (ticket <= 5) {
                    System.out.println("Booking successfull ");
                } else {
                    System.out.println("Maximum 5 Tickets Allowed");
                }
            } else {
                System.out.println("Valid card required ");
            }

        } else {
            System.out.println("Not eligible");
        }

    }

}
