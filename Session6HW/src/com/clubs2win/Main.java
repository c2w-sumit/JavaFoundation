package com.clubs2win;

public class Main {

    public static void main(String[] args) {
        ///// Coding Problem array123 -------- start /////////
        int values[] = new int[10];

        //Test #1
        for (int i = 0; i < values.length; i++) {
            // set value of the ith element
            values[i] = 2 * i;
        }
        System.out.println("Test#1 Array even nums from 0 thru 18 ----> " + array123(values));


        //Test #2
        for (int i = 0; i < values.length; i++) {
            values[i] = i;
        }
        System.out.println("Test#2 Array all numbers from 0 thru 9 ---->" + array123(values));

        ///// Coding Problem array123 -------- end /////////


        ///// Coding Problem arrayCount9 -------- start /////////
        values[2] = 9;
        values[7] = 9;
        System.out.println("Test#1 Number of nines ---->" + arrayCount9(values));

        ///// Coding Problem arrayCount9 -------- end /////////


        ///// Coding Problem  has271 ------ start ///////

        int testValues1[] = {33, 37, 35, 67, 89};
        System.out.println("Test#1 Is it a 2-7-1 pattern?---->" + has271(values));
        int testValues2[] = {33, 37, 45, 67, 89};
        System.out.println("Test#2 Is it a 2-7-1 pattern?---->" + has271(values));


        /////// Coding Problem has 271 ------- end //////


        /////// Coding Problem lonesum ------- start  //////
        System.out.println("LoneSum 2,3,3 ----> " + loneSum(2, 3, 3));
        System.out.println("LoneSum 5,5,3 ----> " + loneSum(5, 5, 3));
        System.out.println("LoneSum 2,8,2 ----> " + loneSum(2, 8, 2));
        System.out.println("LoneSum 5,7,9 ----> " + loneSum(5, 7, 9));
        System.out.println("LoneSum 2,3,5 ----> " + loneSum(2, 3, 5));

        /////// Coding Problem lonesum ------- end  //////


        //// Coding Problem MakeBricks ----- start
        System.out.println("makeBricks(3, 1, 8) → " + makeBricks(3, 1, 8));
        System.out.println("makeBricks(3, 1, 9) → " + makeBricks(3, 1, 9));
        System.out.println("makeBricks(3, 2, 10) → " + makeBricks(3, 2, 10));
        //// Coding Problems MakeBricks ------ end


        //// Coding Problem blackjack ------ start
        System.out.println("blackjack(19, 21) → " + blackjack(19, 21));
        System.out.println("blackjack(21, 19) → " + blackjack(21, 19));
        System.out.println("blackjack(19, 22) → " + blackjack(19, 22));
        //// Coding Problem blackjack ------ end
    }


    public static boolean array123(int[] nums) {
        boolean result = false;
        for (int i = 0; i < (nums.length - 2); i++) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
                result = true;
            }
        }

        return result;
    }


    public static int arrayCount9(int[] nums) {
        int count9 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9) {
                count9++;
            }
        }
        return count9;
    }


    public static boolean has271(int[] nums) {
        int has = 0;
        boolean result = false;

        for (int i = 0; i < nums.length - 2; i++) {

            int val = nums[i];

            if (nums[i + 1] == (val + 5) &&
                    Math.abs(nums[i + 2] - (val - 1)) <= 2) {
                result = true;
            }
        }

        return result;
    }

    public static int loneSum(int a, int b, int c) {
        int runningsum = 0;

        if (a != b && a != c) {
            runningsum += a;
        }

        if (b != a && b != c) {
            runningsum += b;
        }

        if (c != b && c != a) {
            runningsum += c;
        }

        return runningsum;
    }

    public static boolean makeBricks(int small, int big, int goal) {

        boolean return_value = true;

        if ((goal > big * 5 + small) || (goal % 5 > small)) {
            return_value = false;
        }

        return return_value;
    }


    public static int blackjack(int a, int b) {
        int return_value = 0;

        if (a > b) {
            return_value = a;
        } else {
            return_value = b;
        }

        if (a > 21 && b <= 21) {
            return_value = b;
        }

        if (a <= 21 && b > 21) {
            return_value = a;
        }

        return return_value;

    }
}
