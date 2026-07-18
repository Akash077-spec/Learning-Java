package Basics.ConditionalStatement;

import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age : ");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("Eligible to vote ");
        }else{
            System.out.println("You are not eligible");
        }

    }

}
