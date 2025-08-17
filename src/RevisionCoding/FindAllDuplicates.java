package RevisionCoding;

import java.util.ArrayList;
import java.util.Arrays;

public class FindAllDuplicates {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        int[] nums = {1, 2, 2, 4};
        System.out.println(search(arr));
        System.out.println(Arrays.toString(search2(nums)));
    }

    static ArrayList<Integer> search(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else i++;
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                ans.add(arr[j]);
            }
        }
        return ans;
    }

    static int[] search2(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else i++;
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                return new int[]{arr[j], j + 1};
            }
        }
        return new int[]{-1, -1};
    }
}
