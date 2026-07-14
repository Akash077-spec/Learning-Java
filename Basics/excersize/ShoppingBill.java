package Basics.excersize;
import java.util.Scanner;

public class ShoppingBill {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("=============================");
        System.out.println("         SHOPPING BILL");
         System.out.println("=============================" + "\n");
        System.out.println("Enter customer name : ");
        String name = sc.nextLine();
        System.out.println("Enter product  name : ");
        String product = sc.nextLine();
        System.out.println("Enter product price : ");
        double price = sc.nextDouble();
        System.out.println("Enter quantity      : ");
        int quantity = sc.nextInt();
        double  total = price *quantity;
        double gst = (total *18)/100;
        double finalAmount= total+gst;
        System.out.println("------------------------------");
        System.out.println("Customer Name    : " + name);
        System.out.println("Product Name     : " + product);
        System.out.println("Product Price    : " +  "Rs "+ price);
        System.out.println("Quantity         : " + quantity);
         System.out.println("=================================");

        System.out.println("Total       : " + "Rs "+ total);
        System.out.println("GST (18%)   : "  + "Rs " + gst);
        System.out.println("------------------------------" + "\n");
        System.out.println("Final Amount  : "  + "Rs " + finalAmount);
        System.out.println("=================================");
        sc.close();
        
        




    }
    
}
