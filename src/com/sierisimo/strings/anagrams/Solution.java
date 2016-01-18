package com.sierisimo.strings.anagrams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by sierisimo on 17/01/16.
 */
public class Solution {
    private static String sortLexicographic(String arg) {
        char tmp;

        return "";
    }

    private static char[] mergeSort(String arg, List<char[]> prevList) {
        if (arg.isEmpty())
            throw new RuntimeException("Arguments to merge sort should be a string with length greater than zero");

        if (arg.length() == 1) return arg.toCharArray();

        char[] chars = arg.toCharArray();
        char[] result = new char[arg.length()];

        char tmp;

        if (chars.length == 2) {
            if (chars[0] > chars[1]) {
                tmp = chars[0];
                chars[1] = chars[0];
                chars[0] = tmp;
            }

            return chars;
        } else {
            List<char[]> lists = prevList;
            if (lists == null) lists = new ArrayList<>();

            lists.add(mergeSort(arg.substring(0, arg.length() / 2), lists));
            System.out.println(lists);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        String b = scanner.next();


    }
}