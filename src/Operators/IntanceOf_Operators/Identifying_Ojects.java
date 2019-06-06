package Operators.IntanceOf_Operators;

import java.util.ArrayList;
import java.util.Vector;

public class Identifying_Ojects {

    public static void main(String[] args) {
        Dog aDog = new Dog();
        if (aDog instanceof Animal) {
            Animal ani = (Animal) aDog;
            System.out.println(ani);
        }


        Object testObject = new Vector();

        if (testObject instanceof Vector)
            System.out.println("Object was an instance of the class java.util.Vector");

        else if (testObject instanceof ArrayList)
            System.out.println("Object was an instance of the class java.util.ArrayList");
        else

            System.out.println("Object was an instance of the " + testObject.getClass());
    }

}

class Animal {
    public String toString() {
        return "This is an animal ";
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("Woof Woof");
    }
}