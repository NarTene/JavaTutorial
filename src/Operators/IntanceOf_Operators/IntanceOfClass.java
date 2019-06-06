package Operators.IntanceOf_Operators;

public class IntanceOfClass {
    public static void main(String[] args) {
        Child child = new Child();
        if (child instanceof Parent) {
            System.out.println("true");
        }
    }
}

class Parent {
    public Parent() {

    }
}

class Child extends Parent {
    public Child() {
        super();
    }
}