package Basics;

import java.util.Scanner;

public class inputuser {
    public static void main(String[] args) {
        System.out.println("Taking input from user");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();
        sc.nextLine();
        System.out.println("enter name");
        String name = sc.nextLine();
        System.out.println(" your name is :" +name);

    }
}
