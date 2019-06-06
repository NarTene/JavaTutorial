package OOP.Inheritance;

public class Inheritance_Intro  extends SuperClass{
    public static void main(String[] args) {

        // Private method in super class are not allowed to access
        // in child class ...
        Inheritance_Intro intro = new Inheritance_Intro();
        intro.publicMethod();
        intro.protectedMethod();
        intro.defaultMethod();
    }

    /*
     What is method overriding??
     1. When you extend a class, you can chamge the behavior of a method in the parent class this is called method overriding
     2. This happens when you write in a subclass method that has the same signature as a method
     3. If only the name is the same but the list of arguments is not, then it is method over
     */
}

class SuperClass {
    public void publicMethod(){
        System.out.println(" This is a public method");
    }

    protected void protectedMethod(){
        System.out.println("This is a protected method");
    }

    void defaultMethod(){
        System.out.println(" This is a defaultd method");
    }

    private void privateMethod(){
        System.out.println("This is a private method");
    }
}