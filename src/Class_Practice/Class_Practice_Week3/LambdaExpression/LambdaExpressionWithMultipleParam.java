package Class_Practice.Class_Practice_Week3.LambdaExpression;

public class LambdaExpressionWithMultipleParam {

       /*
       interface StringConcat {

    public String sconcat(String a, String b);
}
public class Example {

   public static void main(String args[]) {
        // lambda expression with multiple arguments
    	StringConcat s = (str1, str2) -> str1 + str2;
        System.out.println("Result: "+s.sconcat("Hello ", "World"));
    }
}
        */

    public static void main(String args[]) {
        // lambda expression with multiple arguments
        StringConcat s = (str1, str2) -> str1 + str2;
        System.out.println("Result: "+s.sconcat("Hello ", "World"));
    }


}
        interface StringConcat {
    public String sconcat(String a, String b);

        }