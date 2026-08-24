package Basics.RevisionQuestionPractice;
import java.util.Scanner;
public class RevisionTopic5 {
    public static void main(String[]args)
    {
        //Revision Topic 5: SWITCH.
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First Number :");
        int num1= sc.nextInt();
        System.out.print("Enter Second Number :");
        int num2= sc.nextInt();
        System.out.print("Enter choice : ");
        int choice = sc.nextInt();
        switch( choice){
            case 1:
            System.out.println(num1+num2);
            break;
            case 2:
            System.out.println(num1-num2);
            break;
            case 3:
            System.out.println(num1*num2);
            break;
            case 4:
            System.out.println(num1/num2);
            break;
            default:{
                System.out.println("enter valid number");
            }


    



        }


    }
}
