package com.sierisimo.strings.anagrams;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by sierisimo on 17/01/16.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        String b = scanner.next();

        a = a.toLowerCase();
        b = b.toLowerCase();

        char[] a_arr = a.toCharArray();
        char[] b_arr = b.toCharArray();

        if (a_arr.length != b_arr.length) {
            System.out.println("Not Anagrams");
            return;
        }

        Arrays.sort(a_arr);
        Arrays.sort(b_arr);

        a = new String(a_arr);
        b = new String(b_arr);

        if (a.equals(b)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
}