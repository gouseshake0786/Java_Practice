package com.mahamad.Arrays;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        nums[2] = 23;

        reverse(nums);

        System.out.println(Arrays.toString(nums));
        System.out.println();

        int[][] arr = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int[] ele : arr) {
            System.out.println(Arrays.toString(ele));
        }
    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}
