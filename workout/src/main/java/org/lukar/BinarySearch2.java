package org.lukar;

public class BinarySearch2 {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};

        int target = 6;


        int start = 0;
        int end = arr.length - 1;
        int index = -1;

        while (start <= end) {


            int mid = start + (end-start) / 2;
            System.out.println("Start: "+start);
            System.out.println("End: "+end);
            System.out.println("mid: "+mid);

            System.out.println("target: "+target);
            System.out.println("arr[mid]: "+arr[mid]);



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
        System.out.println(index);
    }
}
