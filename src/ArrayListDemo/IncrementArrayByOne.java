package ArrayListDemo;

import java.util.Arrays;

//Important
public class IncrementArrayByOne {
    public static void main(String[] args) {
        int[] arr = {1, 1, 9};
        int n = arr.length;
        System.out.print(Arrays.toString(IncByOne(arr, n)));
    }

    static int[] IncByOne(int[] arr, int n) {
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] + 1 != 10) {
                arr[i] = arr[i] + 1;
                return arr;
            }
            arr[i] = 0;
        }

        int[] newArr = new int[n + 1];
        newArr[0] = 1;
        return newArr;
    }
}
