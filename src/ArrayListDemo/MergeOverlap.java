package ArrayListDemo;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeOverlap {

    static ArrayList<int[]> mergeOverlap(int[][] arr) {
        int n = arr.length;

        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<int[]> res = new ArrayList<>();

        // Checking for all possible overlaps
        for (int i = 0; i < n; i++) {
            int start = arr[i][0];
            int end = arr[i][1];

            // Skipping already merged intervals
            if (!res.isEmpty() && res.get(res.size() - 1)[1] >= end) {
                continue;
            }

            // Find the end of the merged range
            for (int j = i + 1; j < n; j++) {
                if (arr[j][0] <= end) {
                    end = Math.max(end, arr[j][1]);
                }
            }
            res.add(new int[]{start, end});
        }
        return res;
    }

    static int overlapInt(int[][] arr) {

        int n = arr.length;
        int maxi = 0;

        // Iterate over the arr
        // in order to find overlaps
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = 0; j < n; j++) {

                // same arr won't be counted
                if (i == j) continue;
                if ((arr[j][0] <= arr[i][1]
                        && arr[j][1] >= arr[i][0])) {
                    count++;
                }
            }
            maxi = Math.max(maxi, count);
        }
        return maxi;
    }


    public static void main(String[] args) {
        int[][] arr = {{1993, 1999}, {2000, 2010}};
        ArrayList<int[]> res = mergeOverlap(arr);

        for (int[] interval : res) {
            System.out.println(interval[0] + " " + interval[1]);
        }

        int ans = overlapInt(arr);
        System.out.println(ans);
    }
}