package Basics.loop;

import java.util.Scanner;

public class break01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter number: ");
            int num = sc.nextInt();

            if (num == 7) {
                System.out.println("Correct! You guessed the number.");
                break;
            } else {
                System.out.println("Wrong! Try again.");
            }
        }

        sc.close();
    }
}