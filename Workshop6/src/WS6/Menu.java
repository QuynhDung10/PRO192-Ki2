package WS6;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static int getChoice(ArrayList<String> options) {
        while (true) {
            System.out.println("Student Managing Program");
            for (int i = 0; i < options.size(); i++) {
                System.out.println((i + 1) + "-" + options.get(i));
            }

            System.out.print("Choose 1-" + options.size() + ": ");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();

            try {
                int choice = Integer.parseInt(input);
                if (choice >= 1 && choice <= options.size()) {
                    return choice;
                }
            } catch (NumberFormatException e) {
                // Invalid input, continue to the next iteration of the loop
            }

            System.out.println("Invalid choice. Please try again.");
        }
    }

    public static int getChoice(Object[] options) {
        while (true) {
            System.out.println("Student Managing Program");
            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + "-" + options[i]);
            }

            System.out.print("Choose 1-" + options.length + ": ");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();

            try {
                int choice = Integer.parseInt(input);
                if (choice >= 1 && choice <= options.length) {
                    return choice;
                }
            } catch (NumberFormatException e) {
                // Invalid input, continue to the next iteration of the loop
            }

            System.out.println("Invalid choice. Please try again.");
        }
    }
}
