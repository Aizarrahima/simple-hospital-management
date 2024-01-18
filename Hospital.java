import java.util.ArrayList;

class Hospital {
    ArrayList<Doctor> doctors = new ArrayList<>();
    ArrayList<Patient> patients = new ArrayList<>();
    ArrayList<Appointment> appointments = new ArrayList<>();

    public void registerDoctor(String name, int age, String specialist) {
        Doctor newDoctor = new Doctor(name, age, specialist);
        doctors.add(newDoctor);
        System.out.println("Doctor registered successfully: " + newDoctor.toString());
    }

    public void registerPatient(String name, int age, String gender) {
        Patient newPatient = new Patient(name, age, gender);
        patients.add(newPatient);
        System.out.println("Patient registered successfully: " + newPatient.toString());
    }

    public void displayDoctors() {
        System.out.println("List of Doctors:");
        for (Doctor doctor : doctors) {
            System.out.println(doctor.toString());
        }
    }

    public void displayPatients() {
        System.out.println("List of Patients:");
        for (Patient patient : patients) {
            System.out.println(patient.toString());
        }
    }

    public Doctor searchDoctor(String name) {
        for (Doctor doctor : doctors) {
            if (doctor.name.equalsIgnoreCase(name)) {
                return doctor;
            }
        }
        return null;
    }

    public Patient searchPatient(String name) {
        for (Patient patient : patients) {
            if (patient.name.equalsIgnoreCase(name)) {
                return patient;
            }
        }
        return null;
    }

    public void scheduleAppointment(String patientName, String doctorName, String date) {
        Patient patient = searchPatient(patientName);
        Doctor doctor = searchDoctor(doctorName);

        if (patient != null && doctor != null) {
            Appointment newAppointment = new Appointment(patient, doctor, date);
            appointments.add(newAppointment);
            System.out.println("Appointment scheduled successfully: " + newAppointment.toString());
        } else {
            System.out.println("Patient or Doctor not found. Please check the names.");
        }
    }

    public void displayAppointments() {
        System.out.println("List of Appointments:");
        for (Appointment appointment : appointments) {
            System.out.println(appointment.toString());
        }
    }
}
