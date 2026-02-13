package org.lukar;

public class FindElementInifiteArrayBS {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        int target = 10;


        System.out.println(findElement(arr, target));
    }

    static int findElement(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }

        return search(arr, target, start, end);
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
