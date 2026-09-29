import java.util.Scanner;

public class MarriageEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter gender (M/F or male/female): ");
        String gender = scanner.next().trim().toLowerCase();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        if (gender.equals("m") || gender.equals("male")) {
            if (age >= 21) {
                System.out.println("Eligible for marriage.");
            } else {
                System.out.println("Not eligible for marriage (Minimum age for male is 21).");
            }
        } else if (gender.equals("f") || gender.equals("female")) {
            if (age >= 18) {
                System.out.println("Eligible for marriage.");
            } else {
                System.out.println("Not eligible for marriage (Minimum age for female is 18).");
            }
        } else {
            System.out.println("Invalid gender input.");
        }

        scanner.close();
    }
}