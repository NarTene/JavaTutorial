package OOP.Methods;

public class Class_Test {

    public static void main(String[] args) {
        double val = getAverage(5, 9,6);
    }


    public static double getAverage(int a, int b, int c){
        double average = (a + b + c) /3;

        return average;
    }
}
