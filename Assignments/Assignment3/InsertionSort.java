/*
  (c) Copyright 2018, 2019 Phasmid Software
 */
package edu.neu.coe.info6205.sort.elementary;

import edu.neu.coe.info6205.sort.BaseHelper;
import edu.neu.coe.info6205.sort.Helper;
import edu.neu.coe.info6205.sort.SortWithHelper;
import edu.neu.coe.info6205.util.Config;

public class InsertionSort<X extends Comparable<X>> extends SortWithHelper<X> {

    /**
     * Constructor for any sub-classes to use.
     *
     * @param description the description.
     * @param N           the number of elements expected.
     * @param config      the configuration.
     */
    protected InsertionSort(String description, int N, Config config) {
        super(description, N, config);
    }

    /**
     * Constructor for InsertionSort
     *
     * @param N      the number elements we expect to sort.
     * @param config the configuration.
     */
    public InsertionSort(int N, Config config) {
        this(DESCRIPTION, N, config);
    }

    public InsertionSort(Config config) {
        this(new BaseHelper<>(DESCRIPTION, config));
    }

    /**
     * Constructor for InsertionSort
     *
     * @param helper an explicit instance of Helper to be used.
     */
    public InsertionSort(Helper<X> helper) {
        super(helper);
    }

    public InsertionSort() {
        this(BaseHelper.getHelper(InsertionSort.class));
    }

    /**
     * Sort the sub-array xs:from:to using insertion sort.
     *
     * @param xs   sort the array xs from "from" to "to".
     * @param from the index of the first element to sort
     * @param to   the index of the first element not to sort
     */
    public void sort(X[] xs, int from, int to) {
        final Helper<X> helper = getHelper();

        // FIXME
        for (from = 1; from < xs.length; from++) {
            for (to = from - 1; to >= 0; to--) {
                if (!helper.swapStableConditional(xs,to+1)){
                    break;
                }
            }
        }
        // END

    }

    public static void main(String[] args) {

        // n = 4
        Integer[] arr1 = {2, 1, 3, 4};
        Integer[] arr2 = {1, 2, 3, 4};
        Integer[] arr3 = {1, 2, 4, 3};
        Integer[] arr4 = {4, 3, 2, 1};

        // n = 8
        Integer[] arr5 = {2, 1, 3, 4, 7, 6, 8, 5};
        Integer[] arr6 = {1, 2, 3, 4, 5, 6, 7, 8};
        Integer[] arr7 = {1, 2, 3, 4, 8, 5, 7, 6};
        Integer[] arr8 = {8, 7, 6, 5, 4, 3, 2, 1};

        // n = 16
        Integer[] arr9 = {2, 1, 3, 4, 7, 6, 8, 5, 10, 9, 12, 11, 13, 14, 16, 15};
        Integer[] arr10 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        Integer[] arr11 = {1, 2, 3, 4, 5, 6, 7, 8, 13, 14, 16, 15, 12, 11, 10, 9};
        Integer[] arr12 = {16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        // n = 32
        Integer[] arr13 = {2, 1, 3, 4, 7, 6, 8, 5, 10, 9, 12, 11, 13, 14, 16, 15, 19, 20, 17, 18, 21, 22, 24, 23, 25, 27, 28, 26, 30, 32, 31, 29};
        Integer[] arr14 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32};
        Integer[] arr15 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 19, 20, 17, 18, 21, 22, 24, 23, 25, 27, 28, 26, 30, 32, 31, 29};
        Integer[] arr16 = {32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        // n = 64
        Integer[] arr17 = {2, 1, 3, 4, 7, 6, 8, 5, 10, 9, 12, 11, 13, 14, 16, 15, 19, 20, 17, 18, 21, 22, 24, 23, 25, 27, 28, 26, 30, 32, 31, 29, 33, 36, 34, 35, 37, 38, 40, 39, 42, 41, 43, 44, 46, 45, 48, 47, 52, 50, 49, 51, 54, 55, 56, 53, 59, 58, 60, 57, 64, 61, 62, 63};
        Integer[] arr18 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64};
        Integer[] arr19 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 36, 34, 35, 37, 38, 40, 39, 42, 41, 43, 44, 46, 45, 48, 47, 52, 50, 49, 51, 54, 55, 56, 53, 59, 58, 60, 57, 64, 61, 62, 63};
        Integer[] arr20 = {64, 63, 62, 61, 60, 59, 58, 57, 56, 55, 54, 53, 52, 51, 50, 49, 48, 47, 46, 45, 44, 43, 42, 41, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        long startnano1 = System.nanoTime();
        sort(arr1);
        long endnano1 = System.nanoTime();
        System.out.println("N=4 -- Random Array -- nanotime:" + (endnano1-startnano1) + " nano sec.");

        long startnano2 = System.nanoTime();
        sort(arr2);
        long endnano2 = System.nanoTime();
        System.out.println("N=4 -- Ordered Array -- nanotime:" + (endnano2-startnano2) + " nano sec.");

        long startnano3 = System.nanoTime();
        sort(arr3);
        long endnano3 = System.nanoTime();
        System.out.println("N=4 -- Partially Ordered Array -- nanotime:" + (endnano3-startnano3) + " nano sec.");

        long startnano4 = System.nanoTime();
        sort(arr4);
        long endnano4 = System.nanoTime();
        System.out.println("N=4 -- Reverse Array -- nanotime:" + (endnano4-startnano4) + " nano sec.");
        System.out.println("--------------------------------");

        long startnano5 = System.nanoTime();
        sort(arr5);
        long endnano5 = System.nanoTime();
        System.out.println("N=8 -- Random Array -- nanotime:" + (endnano5-startnano5) + " nano sec.");

        long startnano6 = System.nanoTime();
        sort(arr6);
        long endnano6 = System.nanoTime();
        System.out.println("N=8 -- Ordered Array -- nanotime:" + (endnano6-startnano6) + " nano sec.");

        long startnano7 = System.nanoTime();
        sort(arr7);
        long endnano7 = System.nanoTime();
        System.out.println("N=8 -- Partially Ordered Array -- nanotime:" + (endnano7-startnano7) + " nano sec.");

        long startnano8 = System.nanoTime();
        sort(arr8);
        long endnano8 = System.nanoTime();
        System.out.println("N=8 -- Reverse Array -- nanotime:" + (endnano8-startnano8) + " nano sec.");
        System.out.println("--------------------------------");

        long startnano9 = System.nanoTime();
        sort(arr9);
        long endnano9 = System.nanoTime();
        System.out.println("N=16 -- Random Array -- nanotime:" + (endnano9-startnano9) + " nano sec.");

        long startnano10 = System.nanoTime();
        sort(arr10);
        long endnano10 = System.nanoTime();
        System.out.println("N=16 -- Ordered Array -- nanotime:" + (endnano10-startnano10) + " nano sec.");

        long startnano11 = System.nanoTime();
        sort(arr11);
        long endnano11 = System.nanoTime();
        System.out.println("N=16 -- Partially Ordered Array -- nanotime:" + (endnano11-startnano11) + " nano sec.");

        long startnano12 = System.nanoTime();
        sort(arr12);
        long endnano12 = System.nanoTime();
        System.out.println("N=16 -- Reverse Array -- nanotime:" + (endnano12-startnano12) + " nano sec.");
        System.out.println("--------------------------------");

        long startnano13 = System.nanoTime();
        sort(arr13);
        long endnano13 = System.nanoTime();
        System.out.println("N=32 -- Random Array -- nanotime:" + (endnano13-startnano13) + " nano sec.");

        long startnano14 = System.nanoTime();
        sort(arr14);
        long endnano14 = System.nanoTime();
        System.out.println("N=32 -- Ordered Array -- nanotime:" + (endnano14-startnano14) + " nano sec.");

        long startnano15 = System.nanoTime();
        sort(arr15);
        long endnano15 = System.nanoTime();
        System.out.println("N=32 -- Partially Ordered Array -- nanotime:" + (endnano15-startnano15) + " nano sec.");

        long startnano16 = System.nanoTime();
        sort(arr16);
        long endnano16 = System.nanoTime();
        System.out.println("N=32 -- Reverse Array -- nanotime:" + (endnano16-startnano16) + " nano sec.");
        System.out.println("--------------------------------");

        long startnano17 = System.nanoTime();
        sort(arr17);
        long endnano17 = System.nanoTime();
        System.out.println("N=64 -- Random Array -- nanotime:" + (endnano17-startnano17) + " nano sec.");

        long startnano18 = System.nanoTime();
        sort(arr18);
        long endnano18 = System.nanoTime();
        System.out.println("N=64 -- Ordered Array -- nanotime:" + (endnano18-startnano18) + " nano sec.");

        long startnano19 = System.nanoTime();
        sort(arr19);
        long endnano19 = System.nanoTime();
        System.out.println("N=64 -- Partially Ordered Array -- nanotime:" + (endnano19-startnano19) + " nano sec.");

        long startnano20 = System.nanoTime();
        sort(arr20);
        long endnano20 = System.nanoTime();
        System.out.println("N=64 -- Reverse Array -- nanotime:" + (endnano20-startnano20) + " nano sec.");

    }



    public static final String DESCRIPTION = "Insertion sort";

    public static <T extends Comparable<T>> void sort(T[] ts) {
        new InsertionSort<T>().mutatingSort(ts);
    }
}
