package OOP.Inheritance.Polymorphism;

public class Polymorphism_Intro {

    public int calculateNum(int a, int b){
        return a+b;
    }
    // Overloaded method
    public float calculateNum(float a, float b){
        System.out.println(a+b);
        return a + b;

    }

    public long calculateNum(long a, long b){
        System.out.println(a+b);
        return a + b;
    }

    public static void main(String[] args) {
        Polymorphism_Intro obj = new Polymorphism_Intro();
        obj.calculateNum(12.99f, 14.68f);
        obj.calculateNum(23,69);
        obj.calculateNum(Long.MAX_VALUE, Long.MAX_VALUE);
    }
}
