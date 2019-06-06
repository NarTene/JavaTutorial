package Statement_Control.Exceptions;

import java.util.Scanner;

public class TryCatchFinally {
    public static void main(String[] args) {

        try{
            int num = 120/1;
            System.out.println( num);

        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }finally {
            System.out.println(" Print this statement anyway");
        }
        Scanner scanner = new Scanner(System.in);

       // try{
            int numOne = scanner.nextInt();
            System.out.println();

        //}catch (){
    }
}

