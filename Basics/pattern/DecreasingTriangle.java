package Basics.pattern;

public class DecreasingTriangle {
    public static void main(String[]args){
        for(int row= 1;row<=5;row++){
            for(int col=5;col>=row;col=col-1){
                System.out.print("*");
            }System.out.println();

        }
    }
    
}
