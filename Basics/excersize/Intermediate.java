package Basics.excersize;

import java.util.Scanner;

public class Intermediate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name");
        String name = sc.nextLine();
        System.out.println("roll Number");
        long rollNumber = sc.nextLong();
        System.out.println("Enter subject 1 mark");
        float subject1 = sc.nextFloat();
        System.out.println("Enter subject 2 mark");
        float subject2 = sc.nextFloat();
        System.out.println("Enter subject 3 mark");
        float subject3 = sc.nextFloat();
        System.out.println("Enter subject 4 mark");
        float subject4 = sc.nextFloat();
        System.out.println("Enter subject 5 mark");
        float subject5 = sc.nextFloat();
        float total = subject1 + subject2 + subject3 + subject4 + subject5;
        double percentage = total / 5;
        double cgpa = percentage / 9.5f;
        System.out.println("==========================");
        System.out.println("       STUDENT RESULT        ");
        System.out.println("==========================" + "\n");
        System.out.println("Name        : " + name);
        System.out.println("Roll Number : " + rollNumber);
        System.out.println();// used foe extra space or gap between two line
        System.out.println("Subject 1 mark  : " + subject1);
        System.out.println("Sbject 2 mark  : " + subject2);
        System.out.println("Sbject 3 mark  : " + subject3);
        System.out.println("Sbject 4 mark  : " + subject4);
        System.out.println("Sbject 5 mark  : " + subject5 + "\n");// use \n for gap in two line
        System.out.println("---------------------------" + "\n");
        System.out.println("Total : " + total);
        System.out.println("Percentage : " + percentage);
        System.out.println("CGPA : " + cgpa);
        System.out.println("================================");
        sc.close();

    }

}
