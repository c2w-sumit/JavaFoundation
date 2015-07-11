package com.clubs2win;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("=========== Monkey Trouble ==========");
        System.out.println("aSmile=false, bSmile=false ===>  " + MonkeyTrouble(false, false));
        System.out.println("aSmile=true, bSmile=false ===>  " + MonkeyTrouble(true, false));
        System.out.println("aSmile=false, bSmile=true ===>  " + MonkeyTrouble(false, true));
        System.out.println("aSmile=true, bSmile=true ===>  " + MonkeyTrouble(true, true));
        System.out.println("=====================================");
        System.out.println("");

        System.out.println("=========== Lone Teen ==========");
        System.out.println("a=3, b=99 ===>  " + loneTeen(3,99));
        System.out.println("a=15, b=89 ===> " + loneTeen(15,89));
        System.out.println("a=13, b=18 ===> " + loneTeen(13,18));
        System.out.println("=====================================");
        System.out.println("");

        System.out.println("=========== Caught Speeding ==========");
        System.out.println("speed=65, notbirthday ===> TicketCode:  " + caughtSpeeding(65,false));
        System.out.println("speed=65, birthday ===> TicketCode:  " + caughtSpeeding(65, true));
        System.out.println("speed=65, birthday ===> TicketCode:  " + caughtSpeeding(84, true));
        System.out.println("=====================================");
        System.out.println("");


    }



    public static boolean MonkeyTrouble(boolean aSmile, boolean bSmile)
    {
        boolean myMonkeyInTrouble = false;
        if ((!aSmile && !bSmile)|| (aSmile && bSmile)){
            myMonkeyInTrouble = true;
        }

        return myMonkeyInTrouble;
    }

    public static boolean loneTeen(int a, int b) {

        boolean result = false;
        boolean isATeen = false;
        boolean isBTeen = false;

        if((a >= 13) && (a <= 19)){
            isATeen = true;
        }

        if((b >= 13) && (b <= 19)){
            isBTeen = true;
        }

        if ((isATeen || isBTeen) && !(isATeen && isBTeen)) {
            result = true;
        }
        return result;
    }

    public static int caughtSpeeding(int speed, boolean isBirthday) {

        int ticketCode =0;

        //if its my birthday my effective speed is 5 less than my actual speed
        if (isBirthday)  {
            speed = (speed-5);
        }

        if (speed >= 61 && speed <= 80){
            ticketCode = 1;
        }

        if (speed >= 81) {
            ticketCode = 2;
        }

        return ticketCode;
    }

}
