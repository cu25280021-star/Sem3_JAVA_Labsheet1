import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks for Subject 1 (out of 100): ");
        double m1 = scanner.nextDouble();

        System.out.print("Enter marks for Subject 2 (out of 100): ");
        double m2 = scanner.nextDouble();

        System.out.print("Enter marks for Subject 3 (out of 100): ");
        double m3 = scanner.nextDouble();

        double total = m1 + m2 + m3;
        double percentage = (total / 300) * 100;

        System.out.println("Total Marks: " + total + " / 300");
        System.out.println("Percentage: " + String.format("%.2f", percentage) + "%");

        if (m1 >= 40 && m2 >= 40 && m3 >= 40) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }

        scanner.close();
    }
}