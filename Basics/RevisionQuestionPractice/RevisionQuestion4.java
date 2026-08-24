package Basics.RevisionQuestionPractice;
import java.util.Scanner;
public class RevisionQuestion4 {
    public static void main(String[]args){
        //Revision Topic 4: if, if-else, else-if
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Mark : ");
        int mark=sc.nextInt();
        if(mark<0||mark>100){
            System.out.println("Enter valid number");
        }
        else if(mark>=90){
            System.out.println("Grade A ");
        }else if(mark>=80)
        {
            System.out.println("Grade B");
        }else if(mark>=70){
            System.out.println("Grade C");
        }else if(mark>=60){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Fail");
        }
        sc.close();
    }}
    

