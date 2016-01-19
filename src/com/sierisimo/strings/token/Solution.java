package com.sierisimo.strings.token;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by sierisimo on 18/01/16.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        StringTokenizer tokenizer = new StringTokenizer(s,"!,?._'@ ");

        System.out.println(tokenizer.countTokens());
        while(tokenizer.hasMoreTokens()){
            System.out.println(tokenizer.nextToken());
        }
    }
}
