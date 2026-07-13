package Basics.chapter2;

public class practice02 {
    public static void main(String[] args) {
        // encrypt by adding 8
        char grade = 'A';
        grade = (char) (grade + 8);// here (char is used for typecasting so int value can be changed into char)
        System.out.println(grade);// char + int returns an int.
        // Use type casting to convert the int back to char.
       
       
        // Decrypting by subtracting 8
        grade = (char) (grade - 8);
        System.out.println(grade);
    }

}
