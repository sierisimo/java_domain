package com.sierisimo.strings.stringcompare;

import java.util.Scanner;

/**
 * Created by sierisimo on 17/01/16.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int size = scanner.nextInt();

        String min = null, max = null;

        String sub;
        for (int i = 0; i < input.length() - size + 1; i++) {
            sub = input.substring(i, i + size);
            if (min == null) min = sub;
            if (max == null) max = sub;

            if(min.compareTo(sub) > 0) min = sub;

            if(max.compareTo(sub) < 0) max = sub;
        }

        System.out.println(min);
        System.out.println(max);
    }
}
