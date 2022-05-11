package p01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        boolean continueInput = true;

        do {
            try {

                System.out.print("Enter an integer: ");
                int num = inp.nextInt();

                System.out.println("The entered number is " + num);
                continueInput = false;
            } catch (InputMismatchException ex) {
                System.out.println("Try again. (Incorrect input: an integer is required)");
                inp.nextLine();
            }

        } while (continueInput);

    }
}