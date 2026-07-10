package Basics;

import java.util.Scanner;

public class area {
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter length");
        int length = sc.nextInt();
        sc.nextLine();
        System.out.println("enter breadth");
        int breadth = sc.nextInt();
        sc.nextLine();
        int area;
        area=length*breadth;
        System.out.println("Area="+ area);



    }
}
