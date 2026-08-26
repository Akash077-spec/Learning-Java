package Array;
import java.util.Scanner;
public class Array03 {
    public static void main(String[]args){
        //add user input and output for integer array
        Scanner sc=new Scanner(System.in);
        int arr[] = new int[6];
        System.out.print("Enter number :");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array element are : ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        sc.close();

        
    }
}
