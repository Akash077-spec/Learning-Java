package Basics.chapter1;
import java.util.Scanner;
public class identify {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // program to identify whether number is s integer or not
        System.out.println("Enter number");
        boolean num= sc.hasNextInt();
        System.out.println(num);
    }
    
}
