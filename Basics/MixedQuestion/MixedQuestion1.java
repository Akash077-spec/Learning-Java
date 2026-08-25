package Basics.MixedQuestion;
import java.util.Scanner;
public class MixedQuestion1 {
    public static void main(String[]args){
        //Mixed Question 1 — Number Analysis
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Number : ");
        int num= sc.nextInt();
        if(num%2==0){
            System.out.println(num + " is Even");
        }else{
             System.out.println(num + " is Odd");
        }sc.close();
    }
}
