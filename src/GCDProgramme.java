import java.io.*;
public class GCDProgramme {
    public static void main(String[] args){
        int a=36, b= 60, ans=1;
        int n=Math.min(a,b);
        for(int i=1;i<=n;i++){
            ans=i;
        }
        System.out.println(ans);
    }
}
