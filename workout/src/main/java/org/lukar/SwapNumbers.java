package org.lukar;

import java.util.Arrays;

public class SwapNumbers {

    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 4, 5};


        swap(arr, 2, 4);

        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int start, int end) {
        arr[start] = arr[start]+arr[end];
        arr[end] = arr[start] - arr[end];
        arr[start] = arr[start] - arr[end];


    }
}
