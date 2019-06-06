package DataTypes.ReferenceDataType;
  //import java.lang.*;
public class WrapperClassExample {


    // Wrapper Class to convert from primitive int data type to Interger object data type

    public static void main(String args[]) {
        int num = 100;

        Integer obj ;
        obj = Integer.valueOf(num);

        Integer obj1 =  Integer.valueOf(200);

        System.out.println(num + " " + obj);
        System.out.println("obj1 value is:" + obj1);


        /*
         Converting from wrapper class object to primitive
         */

        // creating a wrapper class object
        Integer obj2 = new Integer(100);

        //converting the wrapper object to primitive
        int num2 = obj2.intValue();
        System.out.println(num2 + " " + obj2 );
    }
}
