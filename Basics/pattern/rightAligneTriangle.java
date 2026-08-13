package Basics.pattern;

public class rightAligneTriangle {
    public static void main(String[] args) {

        for (int row = 1; row <= 5; row++) {

            // Print spaces
            for (int space = 1; space <= 5 - row; space++) {
                System.out.print(" ");
            }

            // Print stars
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }

            // Move to next row
            System.out.println();
        }
    }
}