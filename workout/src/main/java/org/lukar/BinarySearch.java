package org.lukar;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 5, 8, 11, 34, 65, 88, 91, 99};

        int target = 65;


        int start = 0;
        int end = arr.length - 1;
        int index = -1;

        while (start <= end) {
            int mid = start + (end-start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;

            } else if (target > arr[mid]) {
                start = mid + 1;

            } else {
                index = mid;
                break;
            }
        }
        System.out.println(index);
    }
}
