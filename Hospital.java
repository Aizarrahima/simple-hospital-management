import java.util.ArrayList;

class Hospital {
    ArrayList<Patient> patients = new ArrayList<>();

    public void registerPatient(String name, int age, String gender) {
        Patient newPatient = new Patient(name, age, gender);
        patients.add(newPatient);
        System.out.println("Patient registered successfully: " + newPatient.toString());
    }

    public void displayPatients() {
        System.out.println("List of Patients:");
        for (Patient patient : patients) {
            System.out.println(patient.toString());
        }
    }

    public Patient searchPatient(String name) {
        for (Patient patient : patients) {
            if (patient.name.equalsIgnoreCase(name)) {
                return patient;
            }
        }
        return null;
    }
}
