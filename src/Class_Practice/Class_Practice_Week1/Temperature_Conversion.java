package Class_Practice.Class_Practice_Week1;

public class Temperature_Conversion {
    public static void main(String[] args) {

        int tempFah = 212;
        double tempCel;

        tempCel = ( tempFah - 32  ) * 5 / 9;

        System.out.println(" The temperature in Celcius: " + tempCel);
    }
}
