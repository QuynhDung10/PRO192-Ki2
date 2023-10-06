package WS6;

/**
 *
 * @author ADMIN
 */

public class StudentManager {

    public static void main(String[] args) {
        // options
        String[] options = {"Add new student", "Search a student", "Update name and mark", "Remove a student",
            "List all", "Quit"};
        int choice = 0; // user choice
        StudentList list = new StudentList(); // Init empty list

        System.out.println("Student Managing Program");

        do {
            choice = Menu.getChoice(options);

            switch (choice) {
                case 1:
                    list.addStudent();
                    break; // Add new student
                case 2:
                    list.searchStudent();
                    break; // Search student
                case 3:
                    list.updateStudent();
                    break; // Update student
                case 4:
                    list.removeStudent();
                    break; // Remove student
                case 5:
                    list.printAll();
                    break; // Print all students
                default:
                    System.out.println("Bye!");
            }
        } while (choice > 0 && choice < 6);
    }
}
