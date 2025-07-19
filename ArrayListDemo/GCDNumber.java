package ArrayListDemo;

public class GCDNumber {
    public static void main(String[] args) {
        int a = 36, b = 60;
        System.out.println(gcdNumber1(a, b));
    }

    static int gcdNumber(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

    static int gcdNumber1(int num1, int num2) {
        if (num2 == 0) return num1;
        return gcdNumber1(num2, num1 % num2);
    }
}
