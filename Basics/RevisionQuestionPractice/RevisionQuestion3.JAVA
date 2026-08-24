package Basics.RevisionQuestionPractice;
import java.util.Scanner;
public class RevisionQuestion3 {
    public static void main(String[]args){
        //Revision Topic 3: Operators
        Scanner sc = new Scanner(System.in);
        System.out.print("First number : ");
        int num1=sc.nextInt();
         System.out.print("Second number : ");
         int num2=sc.nextInt();
         int addition= num1+num2;
         int subtraction= num1-num2;
         int multiplication= num1*num2;
         int division= num1/num2;
         int remainder= num1%num2;
         System.out.println("Addition is : "+ addition);
         System.out.println("Subtraction is : "+subtraction);
         System.out.println("Multiplication is : "+multiplication);
         System.out.println(" Division is : "+division);
         System.out.println("Remainder is : "+ remainder);
         sc.close();



    }
    
}
