package ArrayListDemo;

//https://leetcode.com/problems/maximum-population-year/description/

/*
Constraints:
        1 <= logs.length <= 100
        1950 <= birthi < deathi <= 2050
 */

public class MaximumPopulationYear {
    public static void main(String[] args) {
        int[][] logs = {{1993, 1999}, {2000, 2010}};

        int[] ans = new int[2051];

        for (int[] num : logs) {
            ans[num[0]]++;
            ans[num[1]]--;
        }

        int maxNum = ans[1950], maxYear = 1950;
        for (int i = 1951; i < ans.length; i++) {
            ans[i] = ans[i] + ans[i - 1];
            if (ans[i] > maxNum) {
                maxNum = ans[i];
                maxYear = i;
            }
        }

        System.out.println(maxYear);
    }
}
