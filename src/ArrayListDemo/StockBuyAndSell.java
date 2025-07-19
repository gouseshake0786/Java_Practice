package ArrayListDemo;

public class StockBuyAndSell {
    public static void main(String[] args) {
        //int[] arr = {7, 1 ,5, 3, 6, 4};
        //int[] arr = {1,2,3,4,5};
        int[] arr = {7, 6, 4, 3, 1};
        int profit = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                profit = profit + arr[i] - arr[i - 1];
            }
        }

        System.out.print(profit);
    }
}
