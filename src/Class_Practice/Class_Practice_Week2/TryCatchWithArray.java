package Class_Practice.Class_Practice_Week2;

public class TryCatchWithArray {

    // code to practice try catch block with array.
    public static void main(String[] args) {

        try{
            int arr[];
            arr = new int[7];
            arr[8] = 30/0;

            System.out.println(" First print statement inside a try block");
        }
        catch(ArithmeticException e){
            System.out.println(" An Arithmethic Exception occurred, you can not divide a number by 0");
        }
        catch(IndexOutOfBoundsException e){
            System.out.println(" An IndexOutOfBoundException occurred");
        }
        catch (Exception e){
            System.out.println(" An exception occurred");
            System.out.println("Hello, out of the try catch block");
        }

        finally {
            System.out.println(" this is finally block");
            System.out.println(" Out of the try-catch finally ");
        }
    }
}
