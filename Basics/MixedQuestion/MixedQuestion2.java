package Basics.MixedQuestion;
import java.util.Scanner;
public class MixedQuestion2 {
    public static void main(String[]args){
        🧩 Mixed Question 2 — Sum of Even Numbers
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number : ");
        int num=sc.nextInt();
        int sum=0;
        int i=1;
        while(i<=num){
            if(i%2==0){
            sum=sum+i;
                   
        } i++;
    }System.out.println(sum);
}}
