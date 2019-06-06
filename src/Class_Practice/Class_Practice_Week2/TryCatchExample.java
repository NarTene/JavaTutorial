package Class_Practice.Class_Practice_Week2;

public class TryCatchExample {

    public static void main(String[] args) {

        // This is an example of try catch block

        try {
            int num1 = 0;
            int num2 = 62 / num1;
            System.out.println("Hey I'm at the end of try block");

        }catch (ArithmeticException e){
            System.out.println(" An Arithmetic exception occurred, you can not divide an integer by 0");

        }
        catch (Exception e){
            System.out.println(" An exception happened, it is a generic type of exception ");
            System.out.println("I'm out of try-catch block in Java.");
        }

    }
}
