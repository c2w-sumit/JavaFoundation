package com.clubs2win.session8;

public class Main {

    public static void main(String[] args) {
	// write your code here

        isPalindrome(357);
    }

    public static boolean isPalindrome(int number)
    {

        //make a copy so we can reverse it without destroying the original
        int inputNumber = number;
        int reverse = 0;
        boolean returnValue = false;

        while (inputNumber != 0)
        {
            int remainder = inputNumber % 10;
            reverse = reverse * 10 + remainder;
            inputNumber = inputNumber / 10;
        }

        // if original and reverse of number is equal
        // then it is a palindrome
        if (number == reverse)
        {
            returnValue = true;
        }
        return returnValue;
    }

}
