package com.dataroshi.algorithms;

/*
 * Takes in sorted array.
 * Returns index of the found target or -1 when not found
 *
 * */

public class BinarySearch {

    public static int search(int[] sortedArray, int target) {
        int left = 0;
        int right = sortedArray.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            System.out.printf("target %d left %d right %d middle %d %n", target, left, right, middle);

            if (sortedArray[middle] == target) {
                return middle;
            }

            if (sortedArray[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }
}
