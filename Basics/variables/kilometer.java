package Basics.variables;
import java.util.Scanner;
public class kilometer {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance in kilometers");
        double distance = sc.nextDouble();
        System.out.println( "Distance in kilometer is :" + distance);
        double miles= distance * 0.621371d;
        System.out.println("Total distance in miles is: " + miles);
        sc.close();
       
    }
    
}
