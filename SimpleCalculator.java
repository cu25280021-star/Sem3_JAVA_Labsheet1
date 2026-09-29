import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter operator (+, -, *, /): ");
        char op = scanner.next().charAt(0);

        if (op == '+' || op == '-' || op == '*' || op == '/') {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            if (op == '+') {
                System.out.println("Result: " + (num1 + num2));
            } else if (op == '-') {
                System.out.println("Result: " + (num1 - num2));
            } else if (op == '*') {
                System.out.println("Result: " + (num1 * num2));
            } else if (op == '/') {
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
            }
        } else {
            System.out.println("Invalid operator. Please enter one of +, -, *, /");
        }

        scanner.close();
    }
}