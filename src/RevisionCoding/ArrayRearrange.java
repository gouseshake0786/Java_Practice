package RevisionCoding;

import java.util.Arrays;

public class ArrayRearrange {
    public static void main(String[] args) {
        int[] arr = {5, 0, 1, 2, 3, 4};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] + (arr[arr[i]] % n) * n;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] / n;
        }

        System.out.println(Arrays.toString(arr));
    }
}
