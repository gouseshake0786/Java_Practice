package ArrayListDemo;

public class IsPrimeNumber {
    public static void main(String[] args) {
        int num = 5;

        if(isPrime(num))
            System.out.println("Is Prime");
        else
            System.out.println("Not a Prime");

    }

    static boolean isPrime(int num){
        if(num==1) return false;
        if(num==2 || num==3) return true;
        if(num%2 ==0 || num%3==0) return false;

        for(int i=5;i*i<=num; i +=6){
            if(num%i ==0 ||num%(i+2)==0)
                return false;
        }

        return true;
    }
}
