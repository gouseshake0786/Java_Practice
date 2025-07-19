//import buffer_reader class
import java.io.*;
public class JavaInput {
    public static void main(String args[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter a string");
        String name=br.readLine();
        System.out.println("You have entered a string : " + name);
        System.out.println("enter a number");
        int number=Integer.parseInt(br.readLine());
        System.out.println("You have entered a number : " + number);
    }
}
