package pharmacy.service;

import pharmacy.dao.DrugDao;
import pharmacy.entity.Drug;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PatientService {
    private final List<Drug> prescription = new ArrayList<>();
    private Scanner input;

    public void addPrescription() {
        input = new Scanner(System.in);
        DrugDao drugDao = new DrugDao();
        System.out.print("Enter drug id : ");
        Drug drug = drugDao.select(input.nextInt());
        if (drug == null) {
            System.out.println("dont find drug");
        } else {
            prescription.add(drug);
        }
    }

    public void showPrescription() {
        if (prescription.size() > 0) {
            for (Drug drug : prescription) {
                System.out.println(drug);
            }
        } else {
            System.out.println("prescription is empty");
        }
    }
}
