import java.util.Scanner;

class GfG {
    public static void main(String[] args) {

        // SELECT THE OPERATION:
        //  1 for Addition
        //  2 for Subtraction
        //  3 for Multiplication

        int operation = 1;

        // Checking if the selected operation is valid
        if (operation != 1 && operation != 2
                && operation != 3) {
            System.out.print("Invalid Input");
        }
        else {
            // Taking two numbers
            int a = 2, b = 2;

            // Performing the selected operation and
            // displaying the result Addition
            if (operation == 1) {
                System.out.print("Addition result is: "
                        + (a + b));
            }
            // Subtraction
            else if (operation == 2) {
                System.out.print("Subtraction result is: "
                        + (a - b));
            }
            // Multiplication
            else if (operation == 3) {
                System.out.print("Multiplication result is: "
                        + (a * b));
            }
        }
    }
}