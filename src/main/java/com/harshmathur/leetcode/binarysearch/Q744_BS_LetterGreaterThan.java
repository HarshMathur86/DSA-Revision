package com.harshmathur.leetcode.binarysearch;

class Q744_BS_LetterGreaterThan {
    public char nextGreatestLetter(char[] letters, char target) {
        int s = 0;
        int e = letters.length-1;

        while(s <= e) {
            int m = s + (e-s)/2;
            IO.println("m - " + m);
            if (letters[m] <= target) {
                s = m+1;
            } else {
                e = m-1;
            }
        }

        return s >= letters.length ? letters[0] : letters[s];
    }
}