package Basics.RevisionQuestionPractice;
import java.util.Scanner;
public class RevisionTopic6 {
    public static void main(String[]args){
        //Topic 6: while Loop — Practice
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int num=sc.nextInt();
        int i=1;
        int sum=0;
        while(i<=num){
       
             sum= sum+i;
            
            i++;
            sc.close();

        }System.out.println("Sum is : "+ sum);
    }
}
