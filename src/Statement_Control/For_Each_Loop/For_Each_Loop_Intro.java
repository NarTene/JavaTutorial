package Statement_Control.For_Each_Loop;

public class For_Each_Loop_Intro {

    //  for-each loop is essentially read-only

    public static void main(String args[]) {
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        //normal for loop
        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }

        for(int x : nums) {
            System.out.print(x + " ");
            x = x * 10; // no effect on nums
        }

        System.out.println();

        for(int x : nums)
            System.out.print(x + " ");

        System.out.println();
    }
}
