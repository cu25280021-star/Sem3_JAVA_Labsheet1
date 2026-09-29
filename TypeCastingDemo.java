import java.util.Scanner;

public class TypeCastingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a floating-point number: ");
        double floatVal = scanner.nextDouble();

        int intVal = (int) floatVal;

        System.out.println("Original floating-point value: " + floatVal);
        System.out.println("Converted integer value: " + intVal);

        scanner.close();
    }
}