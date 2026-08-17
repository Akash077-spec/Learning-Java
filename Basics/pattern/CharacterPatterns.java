package Basics.pattern;

public class CharacterPatterns {
    public static void main(String[]args){
        for(char row='A';row<='A'+4;row++){
            for(char col='A';col<=row;col++){
                System.out.print(col);

            }System.out.println();
        }
    }
    
}
