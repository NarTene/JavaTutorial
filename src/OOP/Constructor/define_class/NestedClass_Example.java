package OOP.Constructor.define_class;

public class NestedClass_Example {

    // Nested or Inner class in Java
    class A{
        private int i = 11;

        public int value(){

            return i;
        }
    }

    class B {
        //Variable
        private String label;

        //Contructor
        B(String str){
            label = str;
        }

        //Method vs Functions
        String readlabel(){

            return label;
        }


    }

    public static void main(String[] args) {
        NestedClass_Example ns = new NestedClass_Example();

        //must create instance of class in order to access inner class
        NestedClass_Example.A objOne = ns.new A();
        NestedClass_Example.B objTwo = ns.new B("String");
        System.out.println(objOne);
        System.out.println(objTwo);

        //to access inner class you use referencing, apply layer from layer access
        Outside outside = new Outside();
        Outside.Inside inside = outside.new Inside();
        inside.printName(" John Smith");
    }
}
class Outside {
    public class Inside{
        public void printName(String name) {
            System.out.println(name);
        }
    }


}