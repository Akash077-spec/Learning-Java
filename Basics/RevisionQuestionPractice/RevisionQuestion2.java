package Basics.RevisionQuestionPractice;
import java.util.Scanner;

public class RevisionQuestion2 {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("======== STUDENTS DETAILS ========");
        System.out.print("Name : ");
        String name = sc.nextLine();
        System.out.print("Age : ");
        int age= sc.nextInt();
        System.out.print("CGPA : ");
        float CGPA= sc.nextFloat();
        System.out.println(name);
        System.out.println(age);
        System.out.println(CGPA);
        sc.close();

    }
    
}
