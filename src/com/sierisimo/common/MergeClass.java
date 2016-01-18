package com.sierisimo.common;

/**
 * Created by sierisimo on 18/01/16.
 */
public class MergeClass {
    public static int[] mergeSort(int[] arg) {
        if (arg.length == 1) return arg;

        if (arg.length == 2) {
            int tmp;
            if (arg[0] > arg[1]) {
                tmp = arg[0];
                arg[0] = arg[1];
                arg[1] = tmp;
            }

            return arg;
        } else {
            int[] l1 = new int[arg.length / 2];

            int secondLength = arg.length % 2 == 0 ? arg.length / 2 : arg.length / 2 + 1;

            int[] l2 = new int[secondLength];

            System.arraycopy(arg, 0, l1, 0, arg.length / 2);
            System.arraycopy(arg, arg.length / 2, l2, 0, secondLength);

            l1 = mergeSort(l1);
            l2 = mergeSort(l2);

            return merge(l1, l2);
        }
    }

    public static int[] merge(int[] foo, int[] bar) {
        int size = foo.length + bar.length;

        for (int j = 0; j < foo.length; j++) System.out.println("Foo at " + j + ":" + foo[j]);
        for (int j = 0; j < bar.length; j++) System.out.println("Bar at " + j + ":" + bar[j]);

        int[] baz = new int[size];

        int idx = 0;

        while (idx < foo.length && idx < bar.length) {
            if (foo[idx] > bar[idx]) baz[idx] = bar[idx];
            else baz[idx] = foo[idx];

            idx++;
        }

        int fooCont = idx;
        int barCont = idx;

        while (fooCont < foo.length) {
            baz[fooCont] = foo[fooCont];
            fooCont++;
            idx++;
        }

        while (barCont < bar.length) {
            baz[idx] = bar[barCont];
            barCont++;
            idx++;
        }

        return baz;
    }

    public static char[] mergeSrot() {
        return new char[10];
    }
}
