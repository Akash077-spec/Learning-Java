package Basics.string;

public class StringExample{
    public static void main(String[] args){
        String st = "My name is Akash kumar";
        System.out.println(st);
        // finding length ... use st.length()
        System.out.println(st.length());
        // change to lowercase
        System.out.println(st.toLowerCase());
        // uppercase
        System.out.println(st.toUpperCase());
        //using trim method we can eliminate unwanted spsces..
        String name = "       Akash ";
        System.out.println(name);
        System.out.println(name.trim());// trim will remove all the unwanted spaces.
        // substring(int start)
       System.out.println(st.substring(3));
       System.out.println(st.substring(3,9));
       // replace charcater
       System.out.println(name.replace('k','j'));
       //name start with
       System.out.println(st.startsWith("ak"));
       System.out.println(st.indexOf(2));
       // String
// A String stores a sequence of characters.
// String uses double quotes (" ").
// Example:
// String name = "Akash";

// char
// A char stores only one character.
// char uses single quotes (' ').
// Example:
// char grade = 'A';

    }
}