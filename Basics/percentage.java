package Basics;
import java.util.Scanner;
public class percentage {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("=====Percentage Calculator=====");
        System.out.println("Enter subject 1 Mark");
        int sub1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter subject 2 Mark");
        int sub2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter subject 3 Mark");
        int sub3  = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter subject 4 Mark");
        int sub4 = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter subject 5 Mark");
        int sub5 = sc.nextInt();
        sc.nextLine();
        System.out.println("Subject 1 Mark is :" + sub1);
        System.out.println("Subject 2 Mark is :" + sub2);
        System.out.println("Subject 3 Mark is :" + sub3);
        System.out.println("Subject 4 Mark is :" + sub4);
        System.out.println("Subject 5 Mark is :" + sub5);
        int total = sub1 + sub2 + sub3 + sub4 + sub5;
        System.out.println("TotaL marks is :" + total);
        int per = total/5;
        System.out.println("Your subject percentage is:" + per);




    }
    
}
