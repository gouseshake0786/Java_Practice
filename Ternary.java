import java.util.*;
public class Ternary {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(nextPrime(n));
    }

    static int nextPrime(int n){
        int nextP=n+1;
        while(!isPrime(nextP)){
            nextP++;

        }

        return nextP;
    }

    static boolean isPrime(int n){
        if(n==0)
            return false;
        if(n==1)
            return true;
        for(int i=2;i<n;i++){
            if(n%i==0)
                return false;
        }

        return true;
    }


}
