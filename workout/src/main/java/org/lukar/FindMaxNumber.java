package org.lukar;

public class FindMaxNumber {

    public static void main(String[] args) {
        int[] arr = {23, 45, 12, 34};

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

        }
        System.out.println("The Max Value Is: "+max);
    }
}
