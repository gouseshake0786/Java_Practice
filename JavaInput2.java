import java.util.*;
public class JavaInput2 {
    public static void main(String[] args){
        //read the input from keyboard
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String name=sc.nextLine();
        System.out.println("You have entered a String : "+name);
        System.out.print("Enter a number : ");
        int number=sc.nextInt();
        System.out.println("You have entered a number : "+number);
    }
}
