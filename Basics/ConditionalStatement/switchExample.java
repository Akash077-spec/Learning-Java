package Basics.ConditionalStatement;

import java.util.Scanner;

public class switchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" =======Basic calculator======");
        System.out.print("Enter first number : ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number : ");
        double num2 = sc.nextDouble();
        System.out.print("Enter operator (+, -, *, /) : ");
        char oper = sc.next().charAt(0);
        switch (oper) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            case '%':
                System.out.println(num1 % num2);
                break;
            default:
                System.out.println("perform valid caculation");

        }
        sc.close();

    }

}
