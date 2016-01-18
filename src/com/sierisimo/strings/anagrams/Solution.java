package com.sierisimo.strings.anagrams;

import com.sierisimo.common.MergeClass;

import java.util.Scanner;

/**
 * Created by sierisimo on 17/01/16.
 */
public class Solution {
    private static String sortLexicographic(String arg) {
        char[] sorted = mergeSort(arg);
        System.out.println(new String(sorted));
        return "";
    }

    private static char[] mergeSort(String arg) {
        System.out.println("Starting mergeSort with: " + arg);

        if (arg.length() == 1) return arg.toCharArray();

        char[] result = new char[arg.length()];

        if (arg.length() == 2) {
            char[] chars = arg.toCharArray();
            char tmp;

            if (chars[0] > chars[1]) {
                tmp = chars[0];
                chars[1] = chars[0];
                chars[0] = tmp;
            }

            return chars;
        } else {
            char[] hold;
            for (int i = 0; i < result.length; i++){
//                hold =
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        String a = scanner.next();
//        String b = scanner.next();
//
//        sortLexicographic(a);
        int[] sorted = MergeClass.mergeSort(new int[]{10,9,1,5,7,3,8,4,3,-1});
        for (int i = 0; i < sorted.length; i++){
            System.out.println(sorted[i]);
        }
    }
}