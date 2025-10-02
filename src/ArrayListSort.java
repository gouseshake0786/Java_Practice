import java.util.HashMap;

public class ArrayListSort {
    public static void main(String args[]) {
        int[] arr = {2, 4, 5, 9, 8};
        int n = arr.length;
        int target = 7;
        int[] res = printIndex(n, arr, target);
        System.out.println(res[0] + " " + res[1]);


    }

    static void print(int n, int[] arr, int target) {
        for (int i = 0; i <= n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.print(i + " " + j);
                }
            }
        }
    }

    public static int[] printIndex(int n, int[] arr, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int j = 0; j < n; j++) {
            int x = target - arr[j];
            if (hm.containsKey(x) == true) {
                int i = hm.get(x);
                return new int[]{i, j};
            }
            hm.put(arr[j], j);
        }

        return null;
    }
}
