package Creational_Patterns;

public class SingletonWithDoubleCheck<Access> {

       /*
       1. Create Singleton
       2. Synchronized
       3. Check null before creating an instance of singleton class
        */

    //private variable
    private static volatile SingletonWithDoubleCheck instance = null;


    //private Constructor
    private SingletonWithDoubleCheck() {

    }

    //create public get instance method
    public static SingletonWithDoubleCheck getInstance() {
        if (instance == null) {
            synchronized (SingletonWithDoubleCheck.class) {
                if (instance == null) {
                    instance = new SingletonWithDoubleCheck();
                }
            }
        }
        return instance;
    }

    public int getSum(int numOne, int numTwo) {
        return numOne + numTwo;
    }


}



