package Basics.string;

import java.util.Scanner;

public class loginSystem {

    public static void main(String[] args) {
        String username = "Akash";
        String password = "Java123";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username : ");
        String username1 = sc.nextLine();
        System.out.println("Enter password : ");
        String password1 = sc.nextLine();
        if ((username.equals(username1)) && (password.equals(password1))) {
            System.out.println("Login Successfull");
        } else {
            System.out.println("Login not successfull");
            sc.close();
        }
    }
}
