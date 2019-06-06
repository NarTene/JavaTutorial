package OOP.Methods;

public class SampleOfAllDataTypes {
    //Method with the return type of all data types
    // You need to call that method from main method
    // You can choose to keep the method staic or non-static

    public static void main(String[] args) {
        int d = getInt(6, 7);
        System.out.println(" The integer value is:" + d);

        // print a boolean value
        System.out.println(" print a boolean Value");
        boolean val;
        val = checkVal();
        System.out.println("the boolean value is :" + val);

        // get a double value
        double g = getD(2.33);
        System.out.println("the double value :" + g);


    }


    public static int getInt(int a, int b){

        int c = a + b;
        return c;
    }
    public static boolean checkVal() {
        if (2 % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
   public static double getD(double e){
        double z= 12.33;
        double m = z*e;

        return m;

   }


}
