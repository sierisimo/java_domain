package com.sierisimo.introduction.endoffile;

import java.util.Scanner;

/**
 * @author Created by sierisimo on 15/01/16. Originally for java
 */
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cont = 1;
        while (scanner.hasNext()) {
            System.out.printf("%d %s\n", cont, scanner.nextLine());
            cont++;
        }
    }
}
