package Basics.string;

import java.util.Scanner;

public class equal01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First name : ");
        String name1 = sc.nextLine();
        System.out.println("Enter Sceond name : ");
        String name2 = sc.nextLine();
        if (name1.equals(name2)) {
            System.out.println("Names are equal");

        } else {
            System.out.println("Names are not equal");
        }

    }
}