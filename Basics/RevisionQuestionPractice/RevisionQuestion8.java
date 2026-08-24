package Basics.RevisionQuestionPractice;
import java.util.Scanner;
public class RevisionQuestion8 {
    public static void main(String[]args){
        //Revision Topic 8: for Loop
        System.out.println("========= MULTIPLICATION TABLE =======");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int num= sc.nextInt();
        for(int i =1;i<=10;i++){
            int sum= num*i;
            
            System.out.println(num + " " + "*" + " " + i + " " + "=" + " " + sum );
           
        }
    }
}
