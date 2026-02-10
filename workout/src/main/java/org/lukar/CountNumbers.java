package org.lukar;

public class CountNumbers {


    public static void main(String[] args) {

        int number = 133456;

        int count = 0;

        while (number > 0) {

            int reminder = number % 10;

            System.out.println(reminder);


            if (reminder == 3) {
                count++;
            }

            number=number/10;
            System.out.println(number);

        }

        System.out.println(count);

    }
}
