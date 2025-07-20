package ArrayListDemo;

//Given a sorted array of integers and a target, find if there’s a pair of elements that add up to the target. Return true if such a pair can be found, and false otherwise.
public class TwoSumInSortedArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 8, 9};
        int target = 7;
        boolean res = hasTwoSum(arr, target);

        String ans = (res) ? "Present" : "Not Present";

        System.out.println(ans);
    }

    // Custom binary search function
    public static int binarySearch(int[] arr, int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;  // Found
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Not found
    }

    // Function to check if two numbers sum up to target
    public static boolean hasTwoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            // Search for complement in the remaining part of the array
            int index = binarySearch(arr, i + 1, arr.length - 1, complement);
            if (index != -1) {
                return true; // Found a pair
            }
        }
        return false;
    }
}
