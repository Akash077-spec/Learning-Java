package Basics.ConditionalStatement;
import java.util.Scanner;
public class OnlineShoppingSystem {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the mebership type : ");
        String memberType = sc.nextLine();
        if(memberType.equalsIgnoreCase( "gold" )||memberType.equalsIgnoreCase("Silver")){

            System.out.print("Enter order ammount : ");
            double ammount = sc.nextDouble();
            sc.nextLine();
            if(ammount >=1000){
                System.out.print("Do you have a coupon? (yes/no) : S"  );
                String coupon = sc.nextLine();
                if(coupon.equals("yes")){
                    System.out.println("Order Placed Successfully!");
                    System.out.println("10% Discount Applied.");
                }else{
                    System.out.println("Order Placed Successfully!");
                    System.out.println("No Discount Applied.");
                }

            }else{
                System.out.println("Minimum order amount is ₹1000.");
            }

        }else{
            System.out.println("Only Gold and Silver members can place orders.");
        }

    }
}
