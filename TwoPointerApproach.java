public class TwoPointerApproach {
    public static void main(String[] args){
        int[] arr={1,3,5,6,8,9};
        int n=arr.length;
        int target=18;
        System.out.println(twoSumArray(n,arr,target));

    }

    static boolean twoSumArray(int n, int[] arr, int target){
        int left = 0;
        int right=n-1;
        while (left<right){
            if(arr[left]+arr[right]==target)
                return true;
            else if (arr[left]+arr[right]<target) {
                left++;
            }
            else
                right--;
        }

        return false;
    }
}
