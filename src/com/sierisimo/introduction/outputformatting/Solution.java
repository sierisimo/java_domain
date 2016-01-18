package com.sierisimo.introduction.outputformatting;

import java.util.Scanner;

/**
 * @author Created by sierisimo on 14/01/16. Originally for java
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("================================");

        for (int i = 0; i < 3; i++) {
            String s = sc.next();
            int x = sc.nextInt();
            System.out.printf("%-15s%03d\n", s, x);
        }

        System.out.println("================================");
    }
}
