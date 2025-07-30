package com.mahamad.dsa201;

import java.util.ArrayList;
import java.util.HashMap;

//Find distinct numbers in a window
public class DistinctElement {

    public static ArrayList<Integer> distinctElements(int[] arr, int B, int N) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        //Declared HashMap
        HashMap<Integer, Integer> hm = new HashMap<>();
        int i = 0, j = 0;
        while (j < N) {
            hm.put(arr[j], hm.getOrDefault(arr[j], 0) + 1);
            if (j - i + 1 == B) {
                result.add(hm.size());
                hm.put(arr[i], hm.get(arr[i]) - 1);
                if (hm.getOrDefault(arr[i], 0) == 0) {
                    hm.remove(arr[i]);
                }
                i++;
            }
            j++;
        }


        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 9, 3, 3, 7, 3};
        int k = 3;

        ArrayList<Integer> result = distinctElements(arr, k, arr.length);

        result.forEach(elem -> {
            System.out.println(elem);
        });
    }
}
