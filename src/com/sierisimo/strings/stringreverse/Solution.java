package com.sierisimo.strings.stringreverse;

import java.util.Scanner;

/**
 * Created by sierisimo on 17/01/16.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.next();

        boolean flag = true;

        int size = string.length();
        for(int i = 0; i < size; i++){
            if(string.charAt(i) != string.charAt(size - i - 1)){
                flag = false;
                break;
            }
        }

        if(flag) System.out.println("Yes");
        else System.out.printf("No");
    }
}
