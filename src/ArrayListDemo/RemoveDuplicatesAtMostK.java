package ArrayListDemo;

//https://www.geeksforgeeks.org/dsa/reduce-the-array-such-that-each-element-appears-at-most-2-times/
public class RemoveDuplicatesAtMostK {
    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 2,
                2, 2, 3, 3,
                3, 3, 3, 3,
                4, 5};
        int n = arr.length;
        int res = removeDuplicatesFromSortedArrayII(n, arr);

        System.out.println(res);

        for (int i = 0; i < res; i++)
            System.out.print(arr[i] + " ");

    }

    static int removeDuplicatesFromSortedArrayII(int n, int[] arr) {
        int count = 1;
        int idx = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1] && count < 2) {
                count++;
                arr[idx] = arr[i];
                idx++;
            } else if (arr[i] != arr[i - 1]) {
                arr[idx] = arr[i];
                idx++;
                count = 1;
            }
        }
        return idx;
    }
}

