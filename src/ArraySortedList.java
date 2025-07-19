
class Solution {
    public boolean arraySortedOrNot(int[] arr) {
        // code here
        int left=arr[0];
        if(arr.length==1){
            return true;
        }
        else{
            for(int i=1;i<arr.length;i++){
                if(left<arr[i]){
                    left =arr[i];
                    return true;
                }
                else
                    return false;
            }
        }

        return false;
    }
}
public class ArraySortedList {
}

