package com.bridgelabz;

public class Patient {

    private String name;
    private String age;
    private String city;
    private String state;
    private long phoneNumber;
    Hospital.Department department;

    public Patient() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Hospital.Department getDepartment() {
        return department;
    }

    public void setDepartment(Hospital.Department department) {
        this.department = department;
    }

    public Patient(String name, String age, String city, String state, long phoneNumber, Hospital.Department department) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.state = state;
        this.phoneNumber = phoneNumber;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", department='" + department + '\'' +
                '}';
    }

//    public void patientDetails() {
//            System.out.println("Patient Name: "+name);
//            System.out.println("Patient ID: "+age);
//            System.out.println("City: "+city);
//            System.out.println("State: "+state);
//        System.out.println("Phone Number: "+phoneNumber);
//        System.out.println("Department Name: "+department);
//
//    }
}