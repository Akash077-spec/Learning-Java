package Basics.ConditionalStatement;
import java.util.Scanner;
public class gradeCalculator {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("======Grade calculator=======");
        System.out.println();
        System.out.print("Enter mark :");
        double marks = sc.nextDouble();
        if(marks>=90 || marks<=100){
            System.out.println("Grade A");
        }else if(marks>=89 ){
            System.out.println("Grade B");
        }else if (marks>=74){
            System.out.println("Grade c");

        }else if ( marks>=35){
            System.out.println("pass");
        }else{
            System.out.println("Fail");
        }

    }
    
}
