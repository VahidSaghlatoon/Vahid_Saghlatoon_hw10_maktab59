package pharmacy;

import pharmacy.service.PatientService;

public class Main {
    public static void main(String[] args) {
        PatientService ps = new PatientService();
            ps.addPrescription();
            ps.addPrescription();
            ps.addPrescription();
            ps.showPrescription();
    }

}
