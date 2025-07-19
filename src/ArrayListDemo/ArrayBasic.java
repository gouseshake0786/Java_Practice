package ArrayListDemo;

import java.util.Arrays;

public class ArrayBasic {
    public static void main(String[] args) {
//        int[] arr = new int[5];
//        arr[0] = 1;
//        arr[1] = 2;
//        arr[2] = 4;
//        arr[4] = 5;
//        arr[3] = 67;
//
//        System.out.println(Arrays.toString(arr));
//
//        arr[2] = 100;
//        System.out.println(Arrays.toString(arr));
        //find the max in a given array
        int[] arr = {1,4,7,8,12,0,8};
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max)
                max = arr[i];
        }
        System.out.println(max);
        System.out.println(Arrays.toString(arr));

        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
