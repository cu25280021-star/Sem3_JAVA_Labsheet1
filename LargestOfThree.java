import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();

        System.out.print("Enter third number: ");
        double c = scanner.nextDouble();

        if (a >= b) {
            if (a >= c) {
                System.out.println(a + " is the largest.");
            } else {
                System.out.println(c + " is the largest.");
            }
        } else {
            if (b >= c) {
                System.out.println(b + " is the largest.");
            } else {
                System.out.println(c + " is the largest.");
            }
        }

        scanner.close();
    }
}