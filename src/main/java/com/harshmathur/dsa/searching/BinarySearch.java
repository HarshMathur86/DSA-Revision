package com.harshmathur.dsa.searching;

public class BinarySearch {

    static void main() {
        System.out.println("Binary Search");
        int [] arr = {1,3,4,7,9,11,14,17,19,22,25};
        int ans = binarySearch(arr, 7);
        IO.println("ans = " + ans + " value = " + (ans > 0 ? arr[ans]: "NA"));
    }

    static public int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        while(start <= end) {
            int mid = start + (end-start)/2;
            if (arr[mid] > target) {
                end = mid-1;
            } else if (arr[mid] < target) {
                start = mid+1;
            } else {
                return mid;
            }
        }
        return -1;
    }


}
