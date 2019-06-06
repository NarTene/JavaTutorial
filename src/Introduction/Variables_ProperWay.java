package Introduction;

public class Variables_ProperWay {

    //this global variable
    static int numOne;

    public static void main(String[] args) {
        numOne = 20;
        System.out.println(numOne);

        // Local variables to the main().
        int numTwo = 50;
        System.out.println(numTwo);
        getNumber();
    }

    public static void getNumber(){

        // Locale variables to the getNumber()
        int numThree = 99;
        System.out.println(numThree);

        numOne = 40;
        System.out.println(numOne);


    }
}
