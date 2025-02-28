import java.util.Scanner;

public class EvenOddChecker {

    // Method to get an integer input from the user
    public static int getIntegerInput() {
        Scanner scanner = new Scanner(System.in);
        int number = 0; // Variable to store user input

        // Input validation loop
        while (true) {
            System.out.print("Enter an integer: ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                break; // Valid input, exit loop
            } else {
                System.out.println("Invalid input! Please enter a valid integer.");
                scanner.next(); // Clear invalid input
            }
        }

        scanner.close();
        return number;
    }

    // Method to determine if a number is even or odd
    public static String checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return number + " is an Even number.";
        } else {
            return number + " is an Odd number.";
        }
    }

    // Main method to execute the program
    public static void main(String[] args) {
        int userInput = getIntegerInput(); // Get user input
        String result = checkEvenOrOdd(userInput); // Check if even or odd
        System.out.println(result); // Display the result
    }
}
