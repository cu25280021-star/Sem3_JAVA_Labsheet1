import java.util.Scanner;

public class ArmstrongThreeDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        int num = scanner.nextInt();

        if (num >= 100 && num <= 999) {
            int original = num;
            int digit1 = num % 10;
            num /= 10;
            int digit2 = num % 10;
            num /= 10;
            int digit3 = num % 10;

            int sumOfCubes = (digit1 * digit1 * digit1) + 
                             (digit2 * digit2 * digit2) + 
                             (digit3 * digit3 * digit3);

            if (sumOfCubes == original) {
                System.out.println(original + " is an Armstrong number.");
            } else {
                System.out.println(original + " is NOT an Armstrong number.");
            }
        } else {
            System.out.println("Please enter a valid 3-digit positive number.");
        }

        scanner.close();
    }
}