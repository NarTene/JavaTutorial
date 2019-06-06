package Operators.IntanceOf_Operators;

        /*
        The instanceof keyword can be used to test if an object is of a specified type.
        if (objectReference instanceof type)*/

public class Intanceof_Keyword {
    public static void main(String[] args) {
        String s = "Hello";
        if (s instanceof java.lang.String) {
            System.out.println("is a String");
        }


     //	However, applying instanceof on a null reference variable returns false.
     //	For example, the following if statement returns false.

        String o = null;
        if (o instanceof java.lang.String) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
