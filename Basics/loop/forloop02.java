package Basics.loop;
import java.util.Scanner;
public class forloop02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=====MULTIPLICATION TABLE======");
        System.out.print("ENTER NUMBER :");
        int num = sc.nextInt();
        for(int i = 1;i<=10;i++){
            System.out.println(num + "*" + i + "=" +num*i );
        }

    }
    
}
