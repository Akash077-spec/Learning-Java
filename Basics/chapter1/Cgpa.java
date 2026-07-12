package Basics.chapter1;

import java.util.Scanner;

public class Cgpa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====CGPA Calculator====");
        System.out.println("Enter 1 subject mark");
        int sub1 = sc.nextInt();
        System.out.println("Enter 2 subject mark");
        int sub2 = sc.nextInt();
        System.out.println("Enter 3 subject mark");
        int sub3 = sc.nextInt();
        System.out.println("Subect 1 mark is : " + sub1);
        System.out.println("Subect 2 mark is : " + sub2);
        System.out.println("Subect 3 mark is : " + sub3);
        int total = sub1 + sub2 + sub3;
        System.out.println("Your total mark is :" + total);
        double percentage = total / 3.0;
        System.out.println("Percentage is:" + percentage);
        
        double cgpa = percentage / 9.5;
        System.out.println("Your CGPA is:" + cgpa);

    }

}
