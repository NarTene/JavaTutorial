package Class_Practice.Class_Practice_Week3;

public class LambdaExpressionWithParam {

        /*
        @FunctionalInterface
interface MyFunctionalInterface {

	//A method with single parameter
    public int incrementByFive(int a);
}
public class Example {

   public static void main(String args[]) {
        // lambda expression with single parameter num
    	MyFunctionalInterface f = (num) -> num+5;
        System.out.println(f.incrementByFive(22));
    }
}
         */

    public static void main(String[] args) {
        //lambda expression with single parameter num
        MyFunctionalInterface fuInt = (num) -> num+5;
        System.out.println(fuInt.incrementByFive(22));
    }

}

@FunctionalInterface
interface MyFunctionalInterface {

    // A method with single parameter
    public int incrementByFive(int a);


}
