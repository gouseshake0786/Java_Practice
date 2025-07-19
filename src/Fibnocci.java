public class Fibnocci {
    public static void main(String args[]){

        System.out.println(fibNumber(5));
    }

    public static int fibNumber(int n){
        int fir=1;
        int sec=1;
        int fib=0;
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        for(int i=2;i<n;i++){
            fib = fir+sec;
            fir=sec;
            sec = fib;
        }
        return fib;
    }
}
