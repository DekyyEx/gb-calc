package CalculatorService;

import Logic.Complex;
import Logic.ComplexNumber;

public class Calculate extends Complex {
    public static void calculate() {
        if (choice == 1) {
            System.out.println("(a + bi) + (c + di),\n");
            System.out.println("Введите число A:");
            a = input.nextFloat();
            System.out.println("Введите число B:");
            b = input.nextFloat();
            complex1 = new ComplexNumber(a, b);
            System.out.println("Введите число C:");
            a = input.nextFloat();
            System.out.println("Введите число D:");
            b = input.nextFloat();
            complex2 = new ComplexNumber(a, b);
            complex3 = complex1.add(complex2);
            System.out.println("В результате сложения получается: " + complex3.toString());
        }
        if (choice == 2) {
            System.out.println("(a + bi) - (c + di)\n");
            System.out.println("Введите число A:");
            a = input.nextFloat();
            System.out.println("Введите число B:");
            b = input.nextFloat();
            complex1 = new ComplexNumber(a, b);
            System.out.println("Введите число C:");
            a = input.nextFloat();
            System.out.println("Введите число D:");
            b = input.nextFloat();
            complex2 = new ComplexNumber(a, b);
            complex3 = complex1.subtract(complex2);
            System.out.println("В результате вычитания получается: " + complex3.toString());

        }
        if (choice == 3) {
            System.out.println("(a + bi) * (c + di)\n");
            System.out.println("Введите число A:");
            a = input.nextFloat();
            System.out.println("Введите число B:");
            b = input.nextFloat();
            complex1 = new ComplexNumber(a, b);
            System.out.println("Введите число C:");
            a = input.nextFloat();
            System.out.println("Введите число D:");
            b = input.nextFloat();
            complex2 = new ComplexNumber(a, b);
            complex3 = complex1.multiply(complex2);
            System.out.println("В результате умножения получается: " + complex3.toString());

        }
        if (choice == 4) {

            System.out.println("(a + bi) : (c + di)\n");
            System.out.println("Введите число A:");
            a = input.nextFloat();
            System.out.println("Введите число B:");
            b = input.nextFloat();
            complex1 = new ComplexNumber(a, b);
            System.out.println("Введите число C:");
            a = input.nextFloat();
            System.out.println("Введите число D:");
            b = input.nextFloat();
            complex2 = new ComplexNumber(a, b);
            complex3 = complex1.divide(complex2);
            System.out.println("В результате деления получается: " + complex3.toString());
        }
    }
}
