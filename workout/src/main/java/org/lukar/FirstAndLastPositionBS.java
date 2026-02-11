package org.lukar;

public class FirstAndLastPositionBS {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 3, 3, 5, 6, 7};

        int target = 3;

        int firstIndex = search(arr, target, true);
        int lastIndex = search(arr, target, false);


        System.out.println(firstIndex);
        System.out.println(lastIndex);

    }

    static int search(int[] arr, int target, boolean firstOccurance) {

        int start = 0;
        int end = arr.length - 1;
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
                if (firstOccurance) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            System.out.println("-------------------------");
        }
        return index;
    }
}
