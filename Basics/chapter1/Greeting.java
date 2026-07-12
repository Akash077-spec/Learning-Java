package Basics.chapter1;

import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Greeting Program =====");

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Your name is: " + name);
        System.out.println("Hello " + name + "! Have a nice day.");
        sc.close();
    }
}