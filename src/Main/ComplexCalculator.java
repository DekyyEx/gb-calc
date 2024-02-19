package Main;

import Logic.Complex;
import Logic.ComplexNumber;
import Logic.Complex;
import java.util.Scanner;

public class ComplexCalculator extends Complex {
    public  void main(String[] args) {
        System.out.println("\n===COMPLEX CALCULATION===");
        while (choice != 5) {
            System.out.println("\nWhat would you like to do?\n");
            System.out.println("1: Add");
            System.out.println("2: Subtract");
            System.out.println("3: Multiply");
            System.out.println("4: Divide");
            System.out.println("5: Quit\n");
            choice = input.nextInt();

        }
    }
}
