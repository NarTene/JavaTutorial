package Introduction.TestOne;

public class OperationsInJava {
    public static void main(String[] args) {
        int a = 8;
        int b = 6;
        float c = -5;
        float op1 = c + a*6;
        System.out.println(op1);



        int z = 55;
        int d = 9;
        float e =  (z+d) % d;
        System.out.println(e);


        float w = -3;
        int n = 20;
        int m = 5;
        int r = 8;
        float l =  n + w*m / r;
        System.out.println(l);


        int u = 5;
        int i = 15;
        int o = 3;
        int x = 2;
        int q = 8;

        float sol = u + i / o * x - q % o;
        System.out.println(sol);

        /*Write a Java program to print the result of the following operations.
          a. -5 + 8 * 6
          b. (55+9) % 9
          c. 20 + -3*5 / 8
          d. 5 + 15 / 3 * 2 - 8 % 3
        */

        int opOne =  -5 + 8 * 6;
        int opTwo = (55+9) % 9;
        int opThree = 20 + -3*5 / 8;
        int opFour = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println(opOne);
        System.out.println(opTwo);
        System.out.println(opThree);
        System.out.println(opFour);



    }
}
