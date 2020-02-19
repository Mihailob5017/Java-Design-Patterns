package Composite;

import java.util.ArrayList;

public class Employe {
    String name;
    String dept;
    private int salary;
    private ArrayList<Employe> subEmployees;

    public Employe(String name, String dept, int salary, ArrayList<Employe> subEmployees) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.subEmployees = subEmployees;
    }

    public void addSub(Employe e) {
        subEmployees.add(e);

    }

    public void removeSub(Employe e) {
        subEmployees.remove(subEmployees.indexOf(e));
    }

    public void getInfo() {
        String names = "";
        System.out.println("Name:" + name);
        System.out.println("Department:" + dept);
        System.out.println("Salary:" + salary);
        System.out.println("Subemployes:");
        if (subEmployees != null)
            for (Employe employe : subEmployees)
           employe.getInfo();

        System.out.println(names);
    }
}
