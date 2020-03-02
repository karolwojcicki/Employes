package com.company;

import java.io.InputStreamReader;
import java.util.Arrays;

public class Staff {


    private Employee[] employees;
    private int employment = 0;


    public Staff() {
        employees = new Employee[100];
    }


    public Staff(Employee[] employees) {
        this.employees = employees;
    }

    public void addEmploye(Employee employee) {
        if (employment < 100) {
            employees[employment] = employee;
            employment++;
        }
    }

    public double avgSallary(){
        double suma = 0;
        for (int i = 0; i <employment ; i++) {
            suma += employees[i].getPay();
        }
        return suma/employment;
    }
    public  double avgSallary(int section){
        double suma = 0 ;
        int liczbapracownikowDzialu = 0 ;
        for (int i = 0; i <employment ; i++) {

            if (employees[i].ifEmployeeWorksINSection(section)){
                suma +=employees[i].getPay();
                liczbapracownikowDzialu++;
            }
        }
        return suma/liczbapracownikowDzialu;
    }

    public int[] dajDzaialy(){
        int [] dzialy = new int [100];
        for (int i = 0; i <employment ; i++) {
            dzialy[i] = employees[i].getSection();
        }
        return Arrays.copyOfRange(dzialy,0,employment);

    }

    InputStreamReader
}
