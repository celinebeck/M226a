import java.util.ArrayList;

/**
 * @author Celine
 * 1.4.2025
 */
public class Patient {
    //parametri
    private String name;
    private int age;
    private PatientType patientType;
    private char gender;

    //getter e setter
    public void setGender(char gender) {
        if (gender == 'M' || gender == 'F') {
            this.gender = gender;
        }
        else{
            System.out.println("Invalid gender");
        }
    }
    public void setName(String name) {
        this.name = name;
    }
    private void setAge() {
        int ranage = (int)(Math.random() * 101);
        this.age = ranage;
    }
    public void setPatientType(PatientType patientType) {
        this.patientType = patientType;
    }

    //metodi

    /**
     *
     * @param patients
     * @return media dell'eta dei pazienti presenti nella lista
     */
    public double avgPatientAge(ArrayList<Patient> patients) {
        double sumAge = 0;
        for (Patient patient : patients) {
            sumAge += patient.age;
        }
        return sumAge/patients.size();
    }

    @Override
    public String toString() {
        return (name + " " + age + " " + patientType + " " + gender);
    }
}
