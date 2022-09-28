package com.bridgelabz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hospital {
    String currentHospital;
    enum Department {
        ONCOLOGY, NEUROLOGY, CARDIOLOGY, GYNOCOLOGY
    }

    static ArrayList<Patient> patientList ;
    Map<String, ArrayList> patientMap = new HashMap<>();
    Scanner scr = new Scanner(System.in);

    void addPatients() {
        Patient patients = new Patient();
        System.out.print(" name: ");
        patients.setName(scr.next());
        System.out.print(" patient age: ");
        patients.setAge(scr.next());
        System.out.print("Enter city: ");
        patients.setCity(scr.next());
        System.out.print(" Enter State: ");
        patients.setState(scr.next());
        System.out.print("Enter phone number: ");
        patients.setPhoneNumber(scr.nextLong());
        System.out.println("Choose Department");
        System.out.println("Enter 1 for Oncology department");
        System.out.println("Enter 2 for Neurology department");
        System.out.println("Enter 3 for Cardiology department");
        System.out.println("Enter 4 for Gynocology department");
        int input = scr.nextInt();
        switch (input) {
            case 1:
                patients.setDepartment(Department.ONCOLOGY);
                break;
            case 2:
                patients.setDepartment(Department.NEUROLOGY);
                break;
            case 3:
                patients.setDepartment(Department.CARDIOLOGY);
                break;
            case 4:
                patients.setDepartment(Department.GYNOCOLOGY);
                break;
        }
        patientList.add(patients);
    }

    void addNewHospitals(){
        System.out.println("Enter Hospital name");
        String hospitalName = scr.next();
        ArrayList<Patient> list = new ArrayList<>();
        patientMap.put(hospitalName,list);
        patientList = patientMap.get(hospitalName);
        currentHospital = hospitalName;
    }

    void selectHospital(){
        System.out.println("Enter name of hospital");
        String hospitalName = scr.next();
        for(String key : patientMap.keySet()){
            if (key.equals(hospitalName)){
                patientList = patientMap.get(key);
                currentHospital = key;
            }
        }
//        System.out.println("Current hospital is: "+currentHospital);
    }

    void display(ArrayList hospital){
        for(Object a : hospital ){
            Patient patient = (Patient) a;
            System.out.println(patient);
        }
    }


}
