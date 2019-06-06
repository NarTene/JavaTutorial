package Statement_Control.Exceptions;

          /*
                1. A password must have at least eight characters.\n" +
               "2. A password consists of only letters and digits.\n" +
               "3. A password must contain at least two digits \n" +
               "Input a password (You are agreeing to the above Terms and Conditions.): ");
           */

import java.util.Scanner;

public class PassWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println( "1. A password must have at least eight characters.\n"+
                            "2. A password consists of only letters and digits.\n" +
                            "3. A password must contain at least two digits.\n" +
                          "Input a password (You are agreeing to the above Terms and Conditions.)");

    }
    public static boolean is_Letter(char ch) {
        ch = Character.toUpperCase(ch);// convert each character to Upper case using toUpperCase() method it helps to
        return (ch >= 'A' && ch <= 'Z'); // avoid writing two test conditions, one for lower cases and one for upper
    }                                     //case characters.

    public static boolean is_Numeric(char ch) {

        return (ch >= '0' && ch <= '9'); // verify th
    }

}
