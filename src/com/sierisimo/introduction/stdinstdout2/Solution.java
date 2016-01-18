package com.sierisimo.introduction.stdinstdout2;

import java.util.Scanner;

/**
 * Created by sierisimo on 14/01/16.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        double d = scanner.nextDouble();
        scanner.nextLine();
        String s = scanner.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + num);
    }
}
