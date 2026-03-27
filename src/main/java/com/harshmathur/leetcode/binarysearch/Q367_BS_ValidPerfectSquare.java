package com.harshmathur.leetcode.binarysearch;

class Q367_BS_ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        if (num == 1)
            return true;
        int s = 1;
        int e = num/2;

        while(s <= e) {
            int m = s + (e-s)/2;
            // IO.println(m);
            if ((long)m*m == num)
                return true;
            else if ((long)m*m > num)
                e = m-1;
            else
                s = m+1;
        }
        return false;
    }
}