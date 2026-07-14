package Basics.excersize;
import java.util.Scanner;

public class SalarySlipGenerator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("=============================");
        System.out.println(            "SALARY SLIP");
        System.out.println("=============================" + "\n" + "\n");
        System.out.println("Enter Employee Name : ");
        String name= sc.nextLine();
        System.out.println("Enter Basic Salary : "  );
        double basicSalary= sc.nextDouble();
        double HRA = (basicSalary*20)/100;
        double DA = (basicSalary*10)/100;
        double PF = (basicSalary*12)/100;
        double grossSalary= basicSalary + HRA + DA;
        double netSalary =grossSalary-PF;
        System.out.println("");
        System.out.println("Employee Name   : " + name + " \n");
        System.out.println("Basic Salary    : "  + basicSalary + " \n");
        System.out.println("HRA (20%)      : " + HRA + " \n");
        System.out.println("DA (10%)        : " + DA + " \n");
         System.out.println("PF (12%)        : " + PF + " \n");
         System.out.println("-------------------------------" + "\n");
         System.out.println("Gross Salary     : " + grossSalary + " \n");
         System.out.println("Net Salary       : " + netSalary + " \n");
          System.out.println("-------------------------------" + "\n");
         sc.close();



    }
    
}
