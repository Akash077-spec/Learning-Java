package Basics;
import java.util.Scanner;

public class Average {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Physics mark");
        int num1= sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Chemistry mark");
        int num2= sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Maths mark");
        int num3= sc.nextInt();
        sc.nextLine();
        int total= num1+num2+num3;
        int average= total/3;
        System.out.println("Total="+ total);
        System.out.println("Average="+ average);

        

    }
    
}
