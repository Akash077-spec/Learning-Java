package Basics;

import java.util.Scanner;

public class input01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter name");
        String name = sc.nextLine();
        // nextInt() reads only the number.
        // It does NOT read the Enter key.
        // nextLine() removes the leftover Enter key.
        // Without this line, the next nextLine() may be skipped.
        //sc.nextLine();//not use after sc.nextLine();


        System.out.println("enter your age");
        int num = sc.nextInt();
        System.out.println("your name is:" + name);
        System.out.println("your age is:" + num);

    }
}
