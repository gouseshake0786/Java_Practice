package RevisionCoding;

//https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 0, 0, 1, 2};
        int target = 0;
        System.out.println(search(arr, target));
        System.out.println(search2(arr, target));
    }

    //with duplicates Its work
    public static boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target)
                return true;

            if (nums[mid] > nums[end]) {
                if (nums[start] <= target && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (nums[mid] < nums[end]) {
                if (nums[end] >= target && target > nums[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                end--;
            }
        }

        return false;
    }

    public static boolean search2(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target)
                return true;
            if (nums[start] == nums[mid] && nums[start] == nums[end]) {
                start++;
                end--;
                continue;
            }
            if (nums[start] <= nums[mid]) {
                if (nums[start] <= target && target <= nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (nums[mid] <= target && target <= end) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }
        return false;
    }

    //work with distinct values
    public static boolean search3(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target)
                return true;

            if (nums[start] <= nums[mid]) {
                if (nums[start] <= target && target <= nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (nums[mid] <= target && target <= end) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }
        return false;
    }
}
