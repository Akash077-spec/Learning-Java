package Basics;

import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        num =num*num;
        sc.nextLine();
        
        System.out.println("square=" + num);

    }

}
