package Basics.ConditionalStatement;

import java.util.Scanner;

public class atmLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pin = "1234";
        System.out.println("Enter pin : ");
        String pin2 = sc.nextLine();
        System.out.println("Enter ammount");
        double ammount = sc.nextDouble();
        if (pin.equals(pin2)) {
            if (ammount <= 5000) {
                System.out.println("Transcation successfull");
            } else {
                System.out.println("Insufficient ammout ");
            }
        }
    }

}
