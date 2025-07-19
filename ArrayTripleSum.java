import java.util.*;

public class ArrayTripleSum {
    public static void main(String[] args){
        int[] arr={-3 ,0 ,1 ,2 ,-1 ,1 ,-2};
        Arrays.sort(arr);
        int n=arr.length;
        Set<List<Integer>> result = new HashSet<>();

        for(int i=0; i< n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        List<Integer> triplet = Arrays.asList(arr[i], arr[j], arr[k]);
                        Collections.sort(triplet); // sort triplet to avoid duplicates
                        result.add(triplet);
                    }
                }
            }
        }

        // Print result
        for (List<Integer> triplet : result) {
            for (int num : triplet) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
