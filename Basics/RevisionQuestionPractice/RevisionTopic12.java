package Basics.RevisionQuestionPractice;

public class RevisionTopic12 {
    public static void main(String[] args) {
        //🔄 Revision Topic 12: Hollow Patterns
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 6; col++) {
                if (row == 1 || row == 5 || col == 1 || col == 6) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
