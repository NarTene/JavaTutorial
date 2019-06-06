package Creational_Patterns;

public class IntroOfSingleton {

    public static void main(String[] args) {
        //Hash code of instances are different
        IntroOfSingleton intro = new IntroOfSingleton();
        IntroOfSingleton introOne = new IntroOfSingleton();

        System.out.println(intro.hashCode());
        System.out.println(introOne.hashCode());
        System.out.println(intro.hashCode());
    }
}
