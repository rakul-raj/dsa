package org.lukar;

public class FindNoOfEvenDigits {

    public static void main(String[] args) {

        int[] arr = {23, 45, 1, 6712, 89, 123,12345,123456};


        System.out.println(evenDigits(arr));

    }

    static int evenDigits(int[] arr) {

        int count = 0;

        for (int value : arr) {

            int digits = getDigitsLog(value);

            if (digits % 2 == 0)
                count++;

        }
        return count;
    }

    private static int getDigits(int value) {

        int count = 0;

        while (value > 0) {
            count++;
            value = value / 10;

        }

        return count;
    }

    private static int getDigitsLog(int value) {
        return (int)Math.log10(value)+1;
    }
}
