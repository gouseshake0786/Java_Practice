package ArrayListDemo;

public class FindEvenDigits {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(isEvenDigit(arr[i]))
                count++;
        }
        System.out.println(count);
    }

    static boolean isEvenDigit(int num){
        int len = (int)Math.log10(num) + 1;
        if(len %2 == 0)
            return true;
        return false;
    }
}
