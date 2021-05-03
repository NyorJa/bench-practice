package com.company.cods;

import java.util.Arrays;
import java.util.stream.Stream;

public class Solution {
 /*   public int solution(int[] A) {
        // write your code in Java SE 8
        int N = A.length;
        Set<Integer> set = new HashSet<>();
        for (int a : A) {
            if (a > 0) {
                set.add(a);
            }
        }
        for (int i = 1; i <= N + 1; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return 1;
    }*/

    /**
     * Solution number 1
     * @param S
     * @return
     */
    public String solution(String S) {
        String[] words = S.split(" ");
        String reversedString = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reverseWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);
            }
            reversedString = reversedString + reverseWord + " ";
        }

        return reversedString.trim();
    }

    public int solution(int X, int[] A) {
        // write your code in Java SE 8

        int n = A.length;

        int[] left = new int[(n + 1)/2];
        int[] right = new int[n - left.length];

        for (int i = 0; i < n; i++)
        {
            if (i < left.length) {
                left[i] = A[i];
            }
            else {
                right[i - left.length] = A[i];
            }
        }

        long leftCount = Arrays.stream(left).filter(num -> num != X).count();
        long rightCount = Arrays.stream(right).filter(num -> num != X).count();

        int totalCount = (int) leftCount + (int)rightCount;

        return totalCount;
    }



    public int solution(int[] A) {
        // write your code in Java SE 8
        int[] counter = new int[(A[0] * A.length)];
        int max = -1;
        int OccurBefore = -1; // store some random number for a start

        for (int i = 0; i < A.length; i++) {

            if (A[i] > max) {
                max = A[i];
            }
            if (A[i] == OccurBefore) {
                return 0;
            }

            if(A[i] != OccurBefore) {
                OccurBefore = A[i];
                counter[A[i]] += 1;

            }

        }

        if(A.length<max){
            return 0;
        }

        return 1;
//        return 0;
    }

    public  int [] solution1(int [] A, int K) {

        int size = A.length;
        int ret[] = new  int [size];

        if (K < 0 || K > 100 || size == 0) {
            return ret;
        }

        if (size == 1) {
            return A;
        }

        for (int i = 0; i < size; i++) {
            ret[(i + K) % size] = A[i];

            //when i=0 then (0+3)=3 =>(3 modulo 5)= 3
        }

        return ret;
    }

 /*   public String solution(String S) {
        String[] words = S.split(" ");
        String reversedString = "";
      *//*  for (String word : words) {
            StringBuilder stringBuilder = new StringBuilder(word).reverse().append(" ");
            reversedString += stringBuilder.toString();
        }*//*

        for (int i = 0; i < words.length; i++) {
            StringBuilder stringBuilder = new StringBuilder(words[i]).reverse();
            reversedString += stringBuilder.toString();
            if (i != words.length) {
                reversedString += " ";
            }
        }

        return reversedString;
    }*/
}
