package com.sierisimo.strings.patternsyntaxchecker;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * Created by sierisimo on 19/01/16.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int testCases = Integer.parseInt(in.nextLine());

        String pattern;

        Pattern p;

        while (testCases > 0) {
            pattern = in.nextLine();
            try {
                p = Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
        }
    }
}
