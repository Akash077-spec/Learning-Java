package Basics.loop;
import java.util.Scanner;
public class sumOFoddNumber {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        int sum = 0;
        int i=1;
        while(num>=i){
            if(i% 2!=0){
                sum= sum+i;
               

            } i++;
        }System.out.println("sum is :" + sum);
    }
    
}
