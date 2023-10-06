package Workshop1;

import java.util.Scanner;

public class Part3 {
    public static void main(String[] args) {
        String[] list = new String[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Name of 1st student:");
        list[0] = sc.nextLine();
        System.out.println("Name of 2nd student:");
        list[1] = sc.nextLine();
        System.out.println("Name of 3rd student:");
        list[2] = sc.nextLine();
        for (int i = 0; i < 3; i++) {
            String name = list[i];
            String trimmedName = removeExtraWhitespace(name);
            list[i] = capitalizeFirstCharacter(trimmedName);
        }
        System.out.println("List of names with the first character capitalized and extra whitespace removed:");
        for (String name : list)  {
            System.out.println(name);
        }
    }
    
    public static String capitalizeFirstCharacter(String name) {
        if (name == null || name.isEmpty()) {
            return name;
        }
        
        String[] nameParts = name.split(" ");
        StringBuilder capitalizedNames = new StringBuilder();
        for (String part : nameParts) {
            String capitalizedPart = Character.toUpperCase(part.charAt(0)) + part.substring(1).toLowerCase();
            capitalizedNames.append(capitalizedPart).append(" ");
        }        
        return capitalizedNames.toString().trim();
    }
    
    public static String removeExtraWhitespace(String name) {
        if (name == null || name.isEmpty()) {
            return name;
        }
        return name.trim().replaceAll("\\s+", " ");
    }
}