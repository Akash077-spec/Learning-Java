package Basics.MixedQuestion;

import java.util.Scanner;

public class MixedQuestion4 {
    public static void main(String[] args) {

        // 🧩 Mixed Question 4 — Count Digits
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num=sc.nextInt();
        int count=1;
        int i=1;
        while(i<=num){
            num=num/10;
            
            i++;
            count++;
        }System.out.println("Number of digit : " + count);
    }
}