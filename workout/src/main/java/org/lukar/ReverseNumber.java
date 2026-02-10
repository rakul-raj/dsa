package org.lukar;

public class ReverseNumber {

    public static void main(String[] args) {

        int number =12345;

        int ans=0;

        while(number>0){

            int reminder = number%10;
            System.out.println("Reminder: "+reminder);
            number /=10;
            System.out.println("number: "+number);
            ans=ans*10+reminder;
            System.out.println("ans: "+ans);

        }

        System.out.println(ans);

    }
}
