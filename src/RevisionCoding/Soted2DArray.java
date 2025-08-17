package RevisionCoding;

import java.util.Arrays;

public class Soted2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int target = 13;
        System.out.println(Arrays.toString(search(arr, target)));
    }

    static int[] search(int[][] arr, int target) {
        int start = 0;
        int end = arr.length * arr[0].length - 1;
        int len = arr.length;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            int row = mid / len;
            int col = mid % len;

            if (arr[row][col] == target) {
                return new int[]{row, col};
            }

            if (arr[row][col] < target) {
                start++;
            } else
                end--;
        }
        return new int[]{-1, -1};
    }
}
