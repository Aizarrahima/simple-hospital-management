import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hospital hospital = new Hospital();

        while (true) {
            System.out.println("\nHospital Management System");
            System.out.println("1. Register Doctor");
            System.out.println("2. Display Doctors");
            System.out.println("3. Search Doctor");
            System.out.println("4. Register Patient");
            System.out.println("5. Display Patients");
            System.out.println("6. Search Patient");
            System.out.println("7. Schedule Appointment");
            System.out.println("8. Display Appointments");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter doctor name: ");
                    String doctorName = scanner.nextLine();
                    System.out.print("Enter doctor age: ");
                    int doctorAge = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter specialist of doctor: ");
                    String specialist = scanner.nextLine();

                    hospital.registerDoctor(doctorName, doctorAge, specialist);
                    break;

                case 2:
                    hospital.displayDoctors();
                    break;

                case 3:
                    System.out.print("Enter doctor name to search: ");
                    String searchDoctorName = scanner.nextLine();
                    Doctor foundDoctor = hospital.searchDoctor(searchDoctorName);
                    if (foundDoctor != null) {
                        System.out.println("Doctor found: " + foundDoctor.toString());
                    } else {
                        System.out.println("Doctor not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter patient name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter patient age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter patient gender: ");
                    String gender = scanner.nextLine();

                    hospital.registerPatient(name, age, gender);
                    break;

                case 5:
                    hospital.displayPatients();
                    break;

                case 6:
                    System.out.print("Enter patient name to search: ");
                    String searchName = scanner.nextLine();
                    Patient foundPatient = hospital.searchPatient(searchName);
                    if (foundPatient != null) {
                        System.out.println("Patient found: " + foundPatient.toString());
                    } else {
                        System.out.println("Patient not found.");
                    }
                    break;

                case 7:
                    System.out.print("Enter patient name: ");
                    String appointmentPatientName = scanner.nextLine();
                    System.out.print("Enter doctor name: ");
                    String appointmentDoctorName = scanner.nextLine();
                    System.out.print("Enter appointment date: ");
                    String appointmentDate = scanner.nextLine();

                    hospital.scheduleAppointment(appointmentPatientName, appointmentDoctorName, appointmentDate);
                    break;

                case 8:
                    hospital.displayAppointments();
                    break;

                case 9:
                    System.out.println("Exiting the program. Thank you!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}