package com.mahamad;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        //divide(arr, 0, arr.length - 1);
        //arr = mergeSort(arr);

        mergeSortInPlace(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void divide(int[] arr, int startIndex, int endIndex) {
        if (startIndex >= endIndex)
            return;

        int mid = startIndex + (endIndex - startIndex) / 2;
        divide(arr, startIndex, mid);
        divide(arr, mid + 1, endIndex);

        conquer(arr, startIndex, mid, endIndex);
    }

    private static void conquer(int[] arr, int startIndex, int mid, int endIndex) {
        int[] merge = new int[endIndex - startIndex + 1];
        int idx1 = startIndex;
        int idx2 = mid + 1;
        int x = 0;
        while (idx1 <= mid && idx2 <= endIndex) {
            if (arr[idx1] < arr[idx2]) {
                merge[x++] = arr[idx1++];
            } else {
                merge[x++] = arr[idx2++];
            }
        }

        while (idx1 <= mid) {
            merge[x++] = arr[idx1++];
        }

        while (idx2 <= endIndex) {
            merge[x++] = arr[idx2++];
        }

        for (int i = 0, j = startIndex; i < merge.length; i++, j++) {
            arr[j] = merge[i];
        }
    }

    //O(N*logN)
    public static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    public static int[] merge(int[] first, int[] second) {
        int[] merger = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                merger[k] = first[i];
                i++;
            } else {
                merger[k] = second[j];
                j++;
            }
            k++;
        }
        while (i < first.length) {
            merger[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length) {
            merger[k] = second[j];
            j++;
            k++;
        }

        return merger;
    }


    //O(N*logN)
    public static void mergeSortInPlace(int[] arr, int s, int e) {
        if (e - s == 1) {
            return;
        }
        int mid = s + (e - s) / 2;
        mergeSortInPlace(arr, s, mid);
        mergeSortInPlace(arr, mid, e);

        mergeInPlace(arr, s, mid, e);
    }

    public static void mergeInPlace(int[] arr, int s, int m, int e) {
        int[] merger = new int[e - s];
        int i = s;
        int j = m;
        int k = 0;
        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                merger[k] = arr[i];
                i++;
            } else {
                merger[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i < m) {
            merger[k] = arr[i];
            i++;
            k++;
        }

        while (j < e) {
            merger[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < merger.length; l++) {
            arr[s + l] = merger[l];
        }
    }
}
