package Basics.loop;

import java.util.Scanner;

public class sumNaturalNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int sum = 0;
        int i = 1;
        while (i <= num) {
            sum = i + sum;
            i++;
           
        } System.out.println("sum = " + sum);
    }
}
