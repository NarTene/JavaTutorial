package Collections.About_Array;

public class PrintSum {
    public static void main(String[] args) {

        int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sum = 0;
        for (int i : my_array) {
            sum = sum + i;

            System.out.println("The sum of the element:" + sum);

            //Print average of the array
            System.out.println("Avg of array is : " + sum/my_array.length);

            // find the index of the elements 25 and 77.
        }
    }
}
