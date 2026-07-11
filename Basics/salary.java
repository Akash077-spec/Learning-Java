package Basics;

import java.util.Scanner;

public class salary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee name");
        String name=sc.nextLine();
        System.out.println("Enter monthly salary");
        int num=sc.nextInt();
        int yearlySalary;
        yearlySalary= num*12;
        System.out.println("Yearly Salary = "+yearlySalary );

// salary example

    }
    
}
