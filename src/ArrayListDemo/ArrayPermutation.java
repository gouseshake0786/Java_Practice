package ArrayListDemo;

import java.util.Arrays;

//https://leetcode.com/problems/build-array-from-permutation/description/
//Given a zero-based permutation nums (0-indexed), build an array ans of the same length
// where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.
public class ArrayPermutation {
    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 5, 3, 4};

        System.out.println(Arrays.toString(buildArray(nums)));

        System.out.println(Arrays.toString(buildArray2(nums)));

    }

    static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    //TC: O(n) and AS: O(1)
    static int[] buildArray2(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] + (nums[nums[i]] % n) * n;
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] / n;
        }

        return nums;
    }
}
