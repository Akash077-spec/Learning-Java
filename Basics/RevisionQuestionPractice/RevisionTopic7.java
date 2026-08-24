package Basics.RevisionQuestionPractice;

import java.util.Scanner;

public class RevisionTopic7 {
    public static void main(String[] args) {
        //Do-While Practice Question

        Scanner sc = new Scanner(System.in);

        int num;

        do {
            System.out.print("Enter number : ");
            num = sc.nextInt();

        } while (num != 0);

        System.out.println("Program stopped.");

        sc.close();
    }
}