package com.canddella.application.domain;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Operator> operators = new ArrayList<>();

        while (true) {
            System.out.println("Enter operation type (Add, Sin, Cos, Division, Multiplication) or 'exit' to quit:");
            String operationType = scanner.nextLine();

            if (operationType.equalsIgnoreCase("exit")) {
                break;
            }

            Operator operator;

            switch (operationType.toLowerCase()) {
                case "add":
                    operator = createBinaryOperator(scanner, "add");
                    break;
                case "sin":
                    operator = createUnaryOperator(scanner, "Sin");
                    break;
                case "cos":
                    operator = createUnaryOperator(scanner, "Cos");
                    break;
                case "division":
                    operator = createBinaryOperator(scanner, "division");
                    break;
                case "multiplication":
                    operator = createBinaryOperator(scanner, "multiplication");
                    break;
                default:
                    System.out.println("Invalid operation type. Please enter a valid type.");
                    continue;
            }

            operators.add(operator);
            
        

        System.out.println("Results:");
        for (Operator operator1 : operators) {
            System.out.println(operator1.perform());
        }
        }
    }

    private static Operator createBinaryOperator(Scanner scanner, String operatorType) {
        System.out.println("Enter operand 1:");
        int operand1 = scanner.nextInt();
        System.out.println("Enter operand 2:");
        int operand2 = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        switch (operatorType) {
            case "add":
                return new Addition(operand1, operand2);
            case "division":
                return new Division(operand1, operand2);
            case "multiplication":
                return new Multiplication(operand1, operand2);
            default:
            	throw new IllegalArgumentException("Invalid binary operator type.");
        }
    }

    private static Operator createUnaryOperator(Scanner scanner, String operatorType) {
        System.out.println("Enter operand:");
        double operand = scanner.nextDouble();
        scanner.nextLine(); 

        switch (operatorType) {
            case "Sin":
                return new Sin(operand);
            case "Cos":
                return new Cos(operand);
            default: System.out.println("Invalid binary operator type.");
                throw new IllegalArgumentException("Invalid unary operator type.");
        }
    }
}

