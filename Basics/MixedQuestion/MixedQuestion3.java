package Basics.MixedQuestion;
import java.util.Scanner;
public class MixedQuestion3 {
    public static void main(String []args){
        // 🧩 Mixed Question 3 — Factorial
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number : ");
        int num =sc.nextInt();
        int i=1;
        int factorial=1;
        while(i<=num){
            factorial=factorial*i;
            i++;
            
        } System.out.println(factorial);
    } 
    
}
