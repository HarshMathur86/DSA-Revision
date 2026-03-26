package com.harshmathur.leetcode.binarysearch;

public class Q441_BS_ArrangeCoins_$ {

    public int arrangeCoins(int n) {
        int s = 1;
        int e = n;
        int index = -1;

        while(s <= e) {
            int m = s + (e-s)/2;
            if((double)m * (m+1) / 2 <= n) {
                index = m;
                s = m+1;
            } else {
                e = m-1;
            }
        }
        return index;
    }
}
