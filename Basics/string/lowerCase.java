package Basics.string;
import java.util.Scanner;
public class lowerCase {
    // string method .. upper and lower case method
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name : ");
        String name= sc.nextLine();
        System.out.println("Original : " + name);
        System.out.println("Uppercase :" + name.toUpperCase());
       System.out.println("Uppercase :" + name.toLowerCase());
    }
    
}
