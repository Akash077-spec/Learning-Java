package Basics.operator;

public class BitwiseOperator {
    public static void main(String[] args) {

        System.out.println("==Exampple for bitwise operator");
        int a = 65;
        int k = 66;
        int j = 26;
        int s = 0;
        System.out.println(a & k);//bit wise and operator
        System.out.println(a & s);
        System.out.println(a| k);// bitwise or
        System.out.println(a|j);
        System.out.println(a^j);// bitwise XOR
        System.out.println(a>>k);//Right Shift
        System.out.println(j<<k);//Left shift

    }

}
