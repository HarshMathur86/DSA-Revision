package com.harshmathur.leetcode.binarysearch;

public class BS_69_SquareRoot {

    static void main() {
        IO.println(mySqrt(15));
    }

    //Floor of square root
    public static int mySqrt(int x) {
        if (x<2) {
            return x;
        }

        int s = 1;
        int e = x/2;

        while(s<=e) {
            int m = s + (e-s)/2;
            //necessay for Integer overflow fix
            long square = (long) m * m;

            if(square == x) {
                return m;
            } else if(square > x) {
                //Move to left sub-arr
                e = m-1;
            } else if(square < x) {
                ///Move to right
                s = m+1;
            }

        }
        return e;
    }

}
