package org.lukar;

public class BinarySearchFloorNumber {

    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 5, 8, 11, 34, 65, 88, 91, 99};

        int target = 64;

        int start = 0;
        int end = arr.length - 1;

        int ansIndex= findNumber(arr,target,start,end);

        System.out.println(arr[ansIndex]);


    }


    static int findNumber(int[] arr, int target, int start, int end){
        while (start <= end) {
            int mid = (start + end) / 2;

            if (target < arr[mid]) {
                end = mid - 1;

            } else if (target > arr[mid]) {
                start = mid + 1;

            } else {
                return mid;
            }
        }
        return end;
    }
}
