package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("input first number: ");
        int firstNumber = sc.nextInt();

        System.out.println("input second number: ");
        int secondNumber = sc.nextInt();

        System.out.println("input sign");
        String sign = sc.next();

        int anw = switch (sign) {
            case "+" -> firstNumber + secondNumber;
            case "-" -> firstNumber - secondNumber;
            case "*" -> firstNumber * secondNumber;
            case "/" -> firstNumber / secondNumber;
            default -> throw new IllegalArgumentException(sign + " is not support");
        };

        System.out.println("anw = " + anw);
    }
}
