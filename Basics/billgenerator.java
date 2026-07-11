package Basics;

import java.util.Scanner;

public class billgenerator {
    public static void main(String[] args) {
        System.out.println("-----Bill-----");
        Scanner sc = new Scanner(System.in);
        System.out.println("Product");
        String pro = sc.nextLine();
        System.out.println("Price");
        int Price = sc.nextInt();
        System.out.println("Quantity");
        int Quantity = sc.nextInt();
        
        int Total;
        Total = Price*Quantity;
        
        System.out.println("Product:" + pro);
        System.out.println("Price:" + Price);
        System.out.println("Quantity:" + Quantity);



        System.out.println("Total Amount:" + Total);

    }

}
