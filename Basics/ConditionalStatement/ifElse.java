package Basics.ConditionalStatement;
import java.util.Scanner;
public class ifElse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number : " );
        double num = sc.nextDouble();
        if(num>0){
            System.out.println("positive number");
        }else{
            System.out.println("Negative number ");
        }
    }
}
