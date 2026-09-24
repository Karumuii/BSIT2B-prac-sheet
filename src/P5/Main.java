package P5;

import java.util.Scanner;

public class Main {

    // Reads an integer within a range, repeating until valid
    private static int readIntInRange(Scanner sc, String prompt, int min, int max) {
        while (true) {
            System.out.print(prompt);
            String input = sc.nextLine().trim();
            try {
                int value = Integer.parseInt(input);
                if (value >= min && value <= max) {
                    return value;
                }
                System.out.println("Please enter a number between " + min + " and " + max + ".");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Math Learning Support System ===");
        System.out.print("Enter your name: ");
        String name = sc.nextLine().trim();

        System.out.println("\nChoose an activity:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        int choice = readIntInRange(sc, "Enter choice (1-2): ", 1, 2);

        // Polymorphism: abstract type references a subclass
        MathActivity activity;
        if (choice == 1) {
            activity = new AdditionActivity(name);
        } else {
            activity = new SubtractionActivity(name);
        }

        int n = readIntInRange(sc, "How many questions do you want to answer (1-5): ", 1, 5);
        activity.setNumberOfQuestions(n);

        System.out.println();
        activity.start(sc);
        activity.displayResults();

        sc.close();
    }
}
