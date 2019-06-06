package Class_Practice.Class_Practice_Week3.LambdaExpression;

public class LambdaExpressionNoParam {

       /*
       @FunctionalInterface
interface MyFunctionalInterface {

	//A method with no parameter
    public String sayHello();
}
public class Example {

   public static void main(String args[]) {
        // lambda expression
    	MyFunctionalInterface msg = () -> {
    		return "Hello";
    	};
        System.out.println(msg.sayHello());
    }
}
        */

       @FunctionalInterface
    interface MyFunctionalInterface {

           // A method with no parameter
           String sayHello();

       }

    public static void main(String[] args) {
        //lambda expression
        MyFunctionalInterface msg = () -> {
            return "Hello";
        };
        System.out.println(msg.sayHello());
    }
}
