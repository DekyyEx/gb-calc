package Main;

import Logic.Complex;
import Logic.ComplexNumber;

import java.util.Set;

import static CalculatorService.Calculate.calculate;


public class ComplexCalculator extends Complex {
    public static void main(String[] args) {
        System.out.println("\n===КОМПЛЕКСНЫЙ КАЛЬКУЛЯТОР===");

        while (choice != 5) {
            System.out.println("\nЧто вы хотите сделать?\n");
            System.out.println("1: Сложение");
            System.out.println("2: Вычитание");
            System.out.println("3: Умножение");
            System.out.println("4: Деление");
            System.out.println("5: Выход\n");
            choice = input.nextInt();
            calculate();
        }

    }



}

