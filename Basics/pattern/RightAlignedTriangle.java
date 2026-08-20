package Basics.pattern;

public class RightAlignedTriangle {
    public static void main(String []args){
        for(int row =1;row<=5;row++){
            for(int  space=1;space<=5-row;space++){
                System.out.print(" ");}
                for(int col=1;col<=row;col++){
                    if(col==1||col==row||row==5){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }System.out.println();
            }
        }

    }

    
