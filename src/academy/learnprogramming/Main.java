package academy.learnprogramming;

public class Main {

    public static void main (String[] args){

        byte myByteValue = 10;
        short myShortValue = 20;
        int myIntValue = 50;
        long myLongChallengeValue = 50000L + (10 * (myByteValue + myShortValue + myIntValue));

        System.out.println(myLongChallengeValue);

        short shortTotal =(short) (1000 + 10 * (myByteValue + myShortValue + myIntValue));

        System.out.println(shortTotal);
    }
}
