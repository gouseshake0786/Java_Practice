package ArrayListDemo;

import java.util.Arrays;

//https://leetcode.com/problems/running-sum-of-1d-array/description/
public class RunningSum {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int n = nums.length;

        for (int i = 1; i < n; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }

        System.out.println(Arrays.toString(nums));
    }
}
