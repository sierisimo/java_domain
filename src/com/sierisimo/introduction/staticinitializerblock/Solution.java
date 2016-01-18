package com.sierisimo.introduction.staticinitializerblock;

import java.util.Scanner;

/**
 * Created by sierisimo on 17/01/16.
 */
public class Solution {
    private static boolean flag;

    public static int B;
    public static int H;

    static {
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();

        if (B <= 0 || H <= 0) {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } else {
            flag = true;
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }
    }
}
