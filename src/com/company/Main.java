package com.company;

public class Main {

    public static void main(String[] args) {

        Staff staff = new Staff();


        Employee employee1 = new Employee("Karol","woj",2000.56,'M',1);
        Employee employee2 = new Employee("Tomek","Kacz",1690.23,'M',1);
        Employee employee3 = new Employee("Karol1","woj",200.01,'M',2);
        Employee employee4 = new Employee("Karol2","woj",200.01,'M',2);
        staff.addEmploye(employee1);
        staff.addEmploye(employee2);
        staff.addEmploye(employee3);
        staff.addEmploye(employee4);


        System.out.println(staff.avgSallary());
        System.out.println(staff.avgSallary(2));

        int[] tab = staff.dajDzaialy();
        for (int i = 0; i <tab.length ; i++) {
            System.out.println(tab[i]);
        }
    }
}
