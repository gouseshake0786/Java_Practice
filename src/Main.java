//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Main sc1;
        sc1 = new Main();
        int result=sc1.calculate(a,b);



        System.out.println(result);
    }
    public int calculate(int a, int b)
    {
        if(b==0){
            a*=10;
        }
        else{
            int temp=b;
            while(b>0){
                temp=temp/10;
                a*=10;
            }
        }
        return a+b;
    }
}