package ArrayListDemo;

import java.util.LinkedList;
import java.util.List;

//https://leetcode.com/problems/add-to-array-form-of-integer/description/
public class ArrayFormInteger {
    public static void main(String[] args) {
        int[] num = {1, 2, 0, 0};
        int K = 34;
        List<Integer> res = addToArrayForm(num, K);
        System.out.println(res);

    }

    public static List<Integer> addToArrayForm(int[] num, int K) {
        List<Integer> res = new LinkedList<>();
        for (int i = num.length - 1; i >= 0; --i) {
            res.add(0, (num[i] + K) % 10);
            K = (num[i] + K) / 10;
        }
        while (K > 0) {
            res.add(0, K % 10);
            K /= 10;
        }
        return res;
    }
}
