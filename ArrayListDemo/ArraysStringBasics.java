package ArrayListDemo;

import java.util.Arrays;

public class ArraysStringBasics {
    public static void main(String[] args) {
        String[] name = new String[5];
        name[0] = "Hi";
        name[1] = "Hello";
        name[2] = "How";
        name[3] = "Bye";
        name[4] = "Good";

        System.out.println(Arrays.toString(name));

        for (String str : name) {
            System.out.print(str + " ");
        }

        System.out.println();
    }
}
