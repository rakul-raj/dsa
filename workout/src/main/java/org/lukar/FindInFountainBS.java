package org.lukar;

public class FindInFountainBS {

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 3, 2, 1};
        int target = 3;


        int value = searchFountain(arr, target);


        System.out.println(value);
    }

    static int searchFountain(int[] arr, int target) {
        int peekIndex = findPeekIndex(arr);

        int firstTry = search(arr, target, 0, peekIndex);

        if (firstTry == -1) {
            return search(arr, target, peekIndex , arr.length - 1);
        }
        return firstTry;
    }


    static int findPeekIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;

            }
        }

        return start;
    }


    static int search(int[] arr, int target, int start, int end) {
        int index = -1;
        while (start <= end) {


            int mid = start + (end - start) / 2;
            System.out.println("Start: " + start);
            System.out.println("End: " + end);
            System.out.println("mid: " + mid);

            System.out.println("target: " + target);
            System.out.println("arr[mid]: " + arr[mid]);


            if (target < arr[mid]) {
                end = mid - 1;

            } else if (target > arr[mid]) {
                start = mid + 1;

            } else {
                index = mid;
                break;
            }
            System.out.println("-------------------------");
        }

        return index;
    }
}
