package Basics.operator;

public class LogicalOperator {
    public static void main(String[] args){
        System.out.println("This is an example for Logical operator");
        int a=66;
        int b=56;
        int c=18;
        int k=66;
        System.out.println(a==b && b>c);
        System.out.println(a==b && b<c);
        System.out.println(a!=b && b>c);
        System.out.println(a==b || b>c);
        System.out.println(a==k && b>c);
        System.out.println(k>c || a<b);


    }    
}
