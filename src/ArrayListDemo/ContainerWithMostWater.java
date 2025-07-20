package ArrayListDemo;

//https://afteracademy.com/blog/container-with-most-water/
public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int res = 0;
        //Implementing using 2 pointer approach;
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int minHeight = Math.min(arr[left], arr[right]);
            int currentArea = (right - left) * minHeight;
            res = Math.max(res, currentArea);

            if (arr[left] < arr[right])
                left++;
            else
                right--;
        }

        System.out.println(res);
    }
}
