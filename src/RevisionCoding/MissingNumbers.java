package RevisionCoding;

import java.util.ArrayList;

// google 448
public class MissingNumbers {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(search(nums));
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
                ans.add(j + 1);
            }
        }


        return ans;
    }
}
