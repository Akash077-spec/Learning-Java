package Basics.pattern;

public class Invertedpyramid {
    public static void main(String[] args) {
        for (int row = 1; row <= 5; row++) {
            for (int space = 0; space <= row-1; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2 * (5 - row) + 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
