package Basics.loop;
import java .util.Scanner;
public class forSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        int sum = 0;
        for(int i = 0; i<=num;i=i+2){
            sum = sum+i;

        }System.out.println("Sum is : " + sum);
    }
    
}
