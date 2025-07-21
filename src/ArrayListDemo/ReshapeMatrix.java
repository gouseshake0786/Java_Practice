package ArrayListDemo;

import java.util.Arrays;

//https://leetcode.com/problems/reshape-the-matrix/description/
public class ReshapeMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1, 2}, {3, 4}};
        int r = 1;
        int c = 4;
        int[][] res = matrixReshape(mat, r, c);
        for (int[] val : res) {
            System.out.println(Arrays.toString(val));
        }
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] ans = new int[r][c];
        int n = mat.length;
        int m = mat[0].length;

        if (n * m != r * c)
            return mat;

        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int row = index / c;
                int col = index % c;
                ans[row][col] = mat[i][j];
                index++;
            }
        }

        return ans;
    }
}
