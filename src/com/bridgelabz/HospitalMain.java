package com.bridgelabz;

import java.util.Scanner;

public class HospitalMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hospital hospital = new Hospital();
        hospital.addNewHospitals();

        while (true) {
            System.out.println(hospital.patientMap.keySet());
            System.out.println("current hospital name "+hospital.currentHospital);
            System.out.println("\n1) To add Patient\n2) To add new Hospital\n3) select hospital\n4) Display patient details\n5) exit");
            int input = scanner.nextInt();
            switch (input){
                case 1:
                    hospital.addPatients();
                    break;
                case 2:
                    hospital.addNewHospitals();
                    break;
                case 3:
                    hospital.selectHospital();
                    break;
                case 4:
                    hospital.display(Hospital.patientList);
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }

}
