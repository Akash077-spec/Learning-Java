package Basics.pattern;

public class DiamondPattern {
    public static void main(String[] args) {
        for (int row = 1; row <= 5; row++) {
            for (int space = 1; space <= 5 - row; space++) {
                System.out.print(" ");

            }
            for (int col = 1; col<=2 *row  - 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }for (int row1 = 1; row1 <= 4; row1++) {
            for (int space = 1; space <= row1; space++) {
                System.out.print(" ");

            }
            for (int col1 =1; col1 <= 2 * (4 - row1)+1; col1++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
