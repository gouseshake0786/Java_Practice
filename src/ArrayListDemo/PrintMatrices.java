package ArrayListDemo;
//print the value in a spiral order
public class PrintMatrices {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 12},
                {4, 5, 6, 23},
                {7, 8, 9, 43}};
        int n = arr.length;
        int m = arr[0].length;
        int left = 0, right = arr[0].length - 1;
        int top = 0, bottom = arr.length - 1;
        int count = 0;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                System.out.print(arr[top][i] + " ");
                count++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                System.out.print(arr[i][right] + " ");
                count++;
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(arr[bottom][i] + " ");
                    count++;
                }
            }
            bottom--;
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(arr[i][left] + " ");
                    count++;
                }
            }
            left++;
        }
    }
}
