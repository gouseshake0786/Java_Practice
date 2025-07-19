package ArrayListDemo;

public class IsPalindrom {
    public static void main(String[] args) {
        int num = 1231;
        int temp = num;
        int reverse = 0;
        while(temp !=0){
            reverse = reverse*10 + temp%10;
            temp /=10;
        }

        if(num == reverse)
            System.out.println("Is Palindrom");
        else System.out.println("Not a Palindrom");
    }
}
