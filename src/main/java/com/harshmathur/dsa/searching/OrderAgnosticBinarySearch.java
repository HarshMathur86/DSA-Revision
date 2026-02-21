package com.harshmathur.dsa.searching;

public class OrderAgnosticBinarySearch {

    static void main() {
        System.out.println("Binary Search");
//        int [] arr = {1,3,4,7,9,11,14,17,19,22,25};
        int [] arr = {25, 22, 19, 17, 14, 11, 9, 7, 4, 3, 1};
        int ans = binarySearch(arr, 9);
        IO.println("ans = " + ans + " value = " + (ans > 0 ? arr[ans]: "NA"));
    }

    static public int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        //finding ascending/descinf
        boolean isAsc = arr[start] < arr[end];


        while(start <= end) {
//            int mid = (start+end)/2;
            int mid = start + (end-start)/2; // Optimized mechisim for not to break int limit

            if (arr[mid] == target){
                return mid;
            }

            if (isAsc) {
                if (arr[mid] > target) {
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            } else {
                if (arr[mid] < target) {
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            }
        }
        return -1;
    }


}



