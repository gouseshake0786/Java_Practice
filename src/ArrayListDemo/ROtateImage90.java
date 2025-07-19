package ArrayListDemo;

import java.util.Arrays;

//https://leetcode.com/problems/rotate-image/description/
public class ROtateImage90 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
        transpose(matrix);
        reverse(matrix);

        //After 90 rotation
        System.out.println("After rotation");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    //Transpose Matrix : row became column and column became row
    static void transpose(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    //Reverse each row
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
}
