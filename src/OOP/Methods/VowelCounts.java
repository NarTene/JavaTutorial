package OOP.Methods;

import java.util.Scanner;

public class VowelCounts {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scanner.nextLine();
        int numVowels = countVowels(str) ;
        System.out.println("Number of  Vowels in the string: " + numVowels);
    }
    public static int countVowels(String str)
    {
        int count = 0;// variable that records number of vowels
        for (int i = 0; i < str.length(); i++)//counter variable for number of characters
        {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {
                count++;
            }
        }
        return count;
    }
}
