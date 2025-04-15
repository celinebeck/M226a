import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PatientManager {
    public static void main(String[] args) {
        Patient p1 = new Patient();
        Patient p2 = new Patient();
        Patient p3 = new Patient();
        Patient p4 = new Patient();
        Patient p5 = new Patient();
        Patient p6 = new Patient();
        p1.setName("franco");
        p1.setGender('M');
        p1.setPatientType(PatientType.AMBULATORIALE);

        p2.setName("Armando");
        p2.setGender('M');
        p2.setPatientType(PatientType.AMBULATORIALE);

        p3.setName("Giulia");
        p3.setGender('F');
        p3.setPatientType(PatientType.EMERGENZA);

        p4.setName("Maria");
        p4.setGender('M');
        p4.setPatientType(PatientType.EMERGENZA);

        p5.setName("Franca");
        p5.setGender('F');
        p5.setPatientType(PatientType.RICOVERATO);

        p6.setName("Maria");
        p6.setGender('F');
        p6.setPatientType(PatientType.RICOVERATO);

        ArrayList<Patient> patients = new ArrayList<Patient>();
        patients.add(p1);
        patients.add(p2);
        patients.add(p3);
        patients.add(p4);
        patients.add(p5);
        patients.add(p6);
        ArrayList<Patient> patientsA = new ArrayList<Patient>();
        patientsA.add(p1);
        patientsA.add(p2);
        ArrayList<Patient> patientsE = new ArrayList<Patient>();
        patientsE.add(p3);
        patientsE.add(p4);
        ArrayList<Patient> patientsR = new ArrayList<Patient>();
        patientsR.add(p5);
        patientsR.add(p6);


        System.out.println(p1.avgPatientAge(patients));
        System.out.println(p2.avgPatientAge(patientsA));
        System.out.println(p3.avgPatientAge(patientsE));
        System.out.println(p4.avgPatientAge(patientsR));

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println(p5.toString());
        System.out.println(p6.toString());
    }
}