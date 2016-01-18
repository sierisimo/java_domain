package com.sierisimo.introduction.loops;

import java.util.Scanner;

/**
 * @author Created by sierisimo on 14/01/16. Originally for java
 */
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a;
        int b;
        int n;
        int cont;

        for (int t = scanner.nextInt(), i = 0; i < t; i++) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            n = scanner.nextInt();

            for (int j = 0; j < n; j++) {
                cont = a;
                for (int k = 0; k <= j; k++) {
                    cont += (int) ((Math.pow(2, k) * b));
                }

                if (cont == -1) continue;

                System.out.printf("%d ", cont);
            }
            System.out.println();
        }
    }
}
