import java.util.*;
public class ArraySort {
public static void main(String args[]){
    int arr[]={1,10,1,1};


    System.out.println(getSingleElement(arr));
}

    public static int getSingleElement(int[] arr)
    {
        int ones = 0, twos = 0;

        for (int num : arr) {
            // First appearance: add to ones
            ones = (ones ^ num) & ~twos;

            // Second appearance: add to twos
            twos = (twos ^ num) & ~ones;
        }

        return ones;
    }

}


