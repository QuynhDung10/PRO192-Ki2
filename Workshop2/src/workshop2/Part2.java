package Workshop2;

import java.util.Scanner;

public class Part2 {

      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString;
        boolean isValid = false;

        do {
            System.out.print("Enter a string (SExxx): ");
            inputString = scanner.nextLine();
            
            try {
                if(inputString.matches("SE\\d{3}")) {
                    isValid = true;
                } else {
                    throw new Exception();
                }
            } catch(Exception e) {
                System.out.println("The string is invalid.");
                isValid = false;
            }
        } while(!isValid);

        System.out.println("The  string is: " + inputString);
    }
}