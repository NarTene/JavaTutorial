package Class_Practice.Class_Practice_Week3.MethodReference;

import java.util.function.BiFunction;

public class MethodReferenceToStaticMeth {

     /*
     import java.util.function.BiFunction;
class Multiplication{
   public static int multiply(int a, int b){
	return a*b;
   }
}
public class Example {
   public static void main(String[] args) {
	BiFunction<Integer, Integer, Integer> product = Multiplication::multiply;
	int pr = product.apply(11, 5);
	System.out.println("Product of given number is: "+pr);
   }
}
      */



    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> product = Multiplication::multiply;
        int pr = product.apply(11,5);
        System.out.println("Product of given number is: " +pr );
    }
}
class Multiplication{
    public static int multiply(int a, int b){
        return a*b;
    }
}