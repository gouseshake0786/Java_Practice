package ArrayListDemo;

//https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/description/
public class MatrixByRotation {
    public static void main(String[] args) {
        int[][] mat = {{0, 1}, {1, 0}};
        int[][] target = {{1, 0}, {0, 1}};

        if (isMatrixPresent(mat, target))
            System.out.println("Matrices  present");
        else
            System.out.println("Matrices not present");

    }

    static boolean isMatrixPresent(int[][] mat, int[][] target) {
        for (int i = 0; i < 4; i++) {
            if (isEqual(mat, target)) return true;
            transpose(mat);
            reverse(mat);
        }
        return false;
    }

    static void transpose(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    static void reverse(int[][] arr) {
        for (int row = 0; row < arr.length; row++) {
            int left = 0;
            int right = arr.length - 1;
            while (left < right) {
                int temp = arr[row][left];
                arr[row][left] = arr[row][right];
                arr[row][right] = temp;
                left++;
                right--;
            }
        }
    }

    public static boolean isEqual(int[][] m1, int[][] m2) {
        if (m1.length != m2.length) return false;
        if (m1[0].length != m2[0].length) return false;
        for (int row = 0; row < m1.length; row++) {
            for (int col = 0; col < m1[0].length; col++) {
                if (m1[row][col] != m2[row][col]) return false;
            }
        }
        return true;
    }
}
