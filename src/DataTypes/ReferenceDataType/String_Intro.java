package DataTypes.ReferenceDataType;

public class String_Intro {
    public static void main(String[] args) {

        String strOne = "1" + "2";

        System.out.println(strOne);

        String strTwo = strOne + "= 4";
        System.out.println(strTwo);

        //How to find the lenght of string
        String name = "JavaClass";

        int len = name.length();

        System.out.println(len);
        System.out.println(name.toLowerCase());
        //int number = s1.compareTo(s2);

        System.out.println(name.toUpperCase());

        String s1 = "Java";
        String s2 = "Javaa";

        System.out.println( s1 == s2);

        if (s1.equals(s2)){
            System.out.println("True");
        }

        //System.out.println(number);


    }
}
