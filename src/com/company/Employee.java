package com.company;

public class Employee {

    private String name;
    private String surnmae;
    private double pay;
    private char gender;
    private int section;

    public Employee(String name, String surnmae, double pay, char gender, int section) {
        this.name = name;
        this.surnmae = surnmae;
        this.pay = pay;
        this.gender = gender;
        this.section = section;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surnmae='" + surnmae + '\'' +
                ", pay=" + pay +
                ", gender=" + gender +
                ", section=" + section +
                '}';
    }

    public boolean ifEmployeeWorksINSection(int section) {

        if (section == this.section)
            return true;
        else
            return false;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurnmae() {
        return surnmae;
    }

    public void setSurnmae(String surnmae) {
        this.surnmae = surnmae;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getSection() {
        return section;
    }

    public void setSection(int section) {
        this.section = section;
    }
}
