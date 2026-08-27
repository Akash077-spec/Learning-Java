package Array;
import java.util.Scanner;
public class ArrayPracticeQuestion3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.print("Enter number : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array elements are : ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }double sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];

        }
        System.out.println("Sum of array are : "+sum);
        double average=(double) sum/arr.length;
        System.out.println("Average is : " + average);

        sc.close();
    }
}
