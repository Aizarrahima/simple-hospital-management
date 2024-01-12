import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hospital hospital = new Hospital();

        while (true) {
            System.out.println("\nHospital Management System");
            System.out.println("1. Register Patient");
            System.out.println("2. Display Patients");
            System.out.println("3. Search Patient");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter patient name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter patient age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter patient gender: ");
                    String gender = scanner.nextLine();

                    hospital.registerPatient(name, age, gender);
                    break;

                case 2:
                    hospital.displayPatients();
                    break;

                case 3:
                    System.out.print("Enter patient name to search: ");
                    String searchName = scanner.nextLine();
                    Patient foundPatient = hospital.searchPatient(searchName);
                    if (foundPatient != null) {
                        System.out.println("Patient found: " + foundPatient.toString());
                    } else {
                        System.out.println("Patient not found.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting the program. Thank you!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}