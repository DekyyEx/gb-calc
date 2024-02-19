package ArithmeticOperation;

import Logic.Complex;
import Logic.ComplexNumber;

public class Multiplication extends Complex {
    if (choice == 3) {
        System.out.println("(a + b) * (c + d)\n");
        System.out.println("Input a:");
        a = input.nextFloat();
        System.out.println("Input b:");
        b = input.nextFloat();
        complex1 = new ComplexNumber(a,b);
        System.out.println("Input c:");
        a = input.nextFloat();
        System.out.println("Input d:");
        b = input.nextFloat();
        complex2 = new ComplexNumber(a,b);
        complex3 = complex1.multiply(complex2);
        System.out.println("The result is: " + complex3.toString());

    }
}
