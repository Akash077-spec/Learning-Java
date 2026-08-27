package Array;

import java.util.Scanner;

public class ArrayPracticeQuestion6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.print("Enter number : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter number to search:");
        int arr1[] = new int[5];
        
        for (int i = 0; i < arr1.length; i++) {
            arr[i] = sc.nextInt();

        }int index = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr1[i]) {
                index = arr[i];
            }
        }System.out.println("Element found at index : "+ index);
    }
}
