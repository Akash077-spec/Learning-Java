package Basics;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sample calculator");
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        sc.nextLine();
        int add = num1 + num2;
        int mul = num1 * num2;
        int div = num1 / num2;
        int sub = num1 - num2;
        int mod = num1 % num2;
        System.out.println("First number = " + num1);
        System.out.println("Second number = " + num2);
        System.out.println("Addition  = " + add);
        System.out.println("Subraction = " + sub);
        System.out.println("Multiplication = " + mul);
        System.out.println("Division = " + div);
        System.out.println("Modulus = " + mod);

    }
}
