package Basics.string;
import java.util.Scanner;


public class equalIgnorCase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String username = "Akash";

        System.out.print("Enter Username: ");

        String input = sc.nextLine();

        if (username.equalsIgnoreCase(input)) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Invalid Username");
        }

        sc.close();
    }
}