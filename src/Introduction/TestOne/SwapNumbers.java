package Introduction.TestOne;


/*
Write a Java program to swap two variables.
If a = 15;
  b = 27;
Expected out put
a = 27;
b = 15;
 */

public class SwapNumbers {
    public static void main(String[] args) {
        int a = 15;
        int b = 27;

        System.out.println("Before swapping a=" + a + " , " + " b=" + b );

        // initiate an integer c and use it to swapp a and b values.
        int c = a;
        a = b;
        b = c;
        System.out.println("After swapping a=" + a + " , " + "b=" + b);
    }
}
