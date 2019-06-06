package Statement_Control.Exceptions;

public class IntroToException {
    public static void main(String[] args) {
        int numOne = 12;
        int numTwo = 0;

        try {
            System.out.println(numOne/numTwo);
        }catch (Exception e){
            System.out.println(" Positive number can not be divided by 0");

        }
        System.out.println(" Outside the try catch block");
    }

}
