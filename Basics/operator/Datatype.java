package Basics.operator;

public class Datatype {

    public static void main(String[] args) {

        byte b = 10;
        short s = 20;
        int i = 30;
        long l = 40L;
        float f = 50.5f;
        double d = 60.5;
        char c = 'A'; // ASCII value = 65

        System.out.println("===== BYTE OPERATIONS =====");
        System.out.println("byte + byte = " + (b + b));
        System.out.println("byte + short = " + (b + s));
        System.out.println("byte + int = " + (b + i));
        System.out.println("byte + long = " + (b + l));
        System.out.println("byte + float = " + (b + f));
        System.out.println("byte + double = " + (b + d));
        System.out.println("byte + char = " + (b + c));

        System.out.println("\n===== SHORT OPERATIONS =====");
        System.out.println("short + short = " + (s + s));
        System.out.println("short + int = " + (s + i));
        System.out.println("short + long = " + (s + l));
        System.out.println("short + float = " + (s + f));
        System.out.println("short + double = " + (s + d));
        System.out.println("short + char = " + (s + c));

        System.out.println("\n===== INT OPERATIONS =====");
        System.out.println("int + int = " + (i + i));
        System.out.println("int + long = " + (i + l));
        System.out.println("int + float = " + (i + f));
        System.out.println("int + double = " + (i + d));
        System.out.println("int + char = " + (i + c));

        System.out.println("\n===== LONG OPERATIONS =====");
        System.out.println("long + long = " + (l + l));
        System.out.println("long + float = " + (l + f));
        System.out.println("long + double = " + (l + d));
        System.out.println("long + char = " + (l + c));

        System.out.println("\n===== FLOAT OPERATIONS =====");
        System.out.println("float + float = " + (f + f));
        System.out.println("float + double = " + (f + d));
        System.out.println("float + char = " + (f + c));

        System.out.println("\n===== DOUBLE OPERATIONS =====");
        System.out.println("double + double = " + (d + d));
        System.out.println("double + char = " + (d + c));

        System.out.println("\n===== CHAR OPERATIONS =====");
        System.out.println("char + char = " + (c + c));
        System.out.println("ASCII value of char = " + (int)c);

    }
}