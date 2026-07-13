package Basics.excersize;
import java.util.Scanner;
public class Begineer03 {
    public static void main (String[] args){
        System.out.println("===Swap two number===");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int A = sc.nextInt();
        System.out.println("Enter second number");
        int B = sc.nextInt();
        System.out.println("=== Before Swap ===");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("===  After swap ===");
        A=A+B;
        B=A-B;
        A=A-B;
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        sc.close();
    }
    
}
