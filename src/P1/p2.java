package P1;

import java.util.Scanner;

public class p2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter an integer: ");

            if (input.hasNextInt()) {
                int number = input.nextInt();
                System.out.println("You entered: " + number);
                break;
            } else {
                System.out.println("Wrong data type");
                input.next(); // Removes the invalid input
            }
        }

        input.close();
    }
}