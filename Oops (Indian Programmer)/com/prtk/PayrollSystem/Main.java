package com.prtk.PayrollSystem;

import java.util.ArrayList;
import java.util.List;

abstract class Employee{
       private String name;
       private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
   public abstract double calculateSalary();
    @Override
   public String toString(){
       return "Employee[name="+name+", id="+id+", salary="+calculateSalary()+"]";
   }
}
class FullTimeEmployee extends Employee{   //throws error since we cant extend abstract using normal class
    private double monthlysalary;
    public FullTimeEmployee(String name, int id, double monthlysalary){
        super(name, id);
        this.monthlysalary= monthlysalary;
    }
    @Override
    public double calculateSalary(){
        return monthlysalary;
    }
}
class PartTimeEmployee extends Employee{
    private int hoursWorked;
    private double hourlyRate;
    public PartTimeEmployee(String name, int id , int hoursWorked, double hourlyRate){
        super(name, id);
        this.hoursWorked= hoursWorked;
        this.hourlyRate= hourlyRate;
    }
    @Override
    public double calculateSalary(){
        return hourlyRate*hoursWorked;
    }
}


class PayrollSystem {
    private List<Employee> employeeList;  //*

    public PayrollSystem() {
        employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void removeEmployee(int id) {
        Employee employeeToRemove = null;
        for (Employee employee : employeeList) {
            if (employee.getId() == id) {
                employeeToRemove = employee;
                break;
            }
        }
            if (employeeToRemove != null) {
                employeeList.remove(employeeToRemove);
            }
        }

        public void displayEmployee () {
            for (Employee employee : employeeList) {
                System.out.println(employee);
            }
        }
    }


public class Main {
    public static void main(String[] args) {
       PayrollSystem payrollSystem = new PayrollSystem();
       FullTimeEmployee empA = new FullTimeEmployee("Kunal", 1,70000);
        FullTimeEmployee empB = new FullTimeEmployee("Ravi", 2,80000);
        FullTimeEmployee empC = new FullTimeEmployee("Roshan", 3,60000);
        FullTimeEmployee empD = new FullTimeEmployee("Varun", 4,50000);
        FullTimeEmployee empE = new FullTimeEmployee("Siddharth", 5,90000);
       PartTimeEmployee empa = new PartTimeEmployee("Aman",101,3,4000);
        PartTimeEmployee empb = new PartTimeEmployee("Parth",102,4,4000);
        PartTimeEmployee empc = new PartTimeEmployee("Priya",103,5,4000);
        PartTimeEmployee empd = new PartTimeEmployee("Alex",104,6,4000);
        PartTimeEmployee empe = new PartTimeEmployee("Sebs",105,7,4000);
       payrollSystem.addEmployee(empA);
       payrollSystem.addEmployee(empB);
        payrollSystem.addEmployee(empC);
        payrollSystem.addEmployee(empD);
        payrollSystem.addEmployee(empE);
        payrollSystem.addEmployee(empa);
        payrollSystem.addEmployee(empb);
        payrollSystem.addEmployee(empc);
        payrollSystem.addEmployee(empd);
        payrollSystem.addEmployee(empe);
        System.out.println("Initial Employee Details: ");
        System.out.println();
        payrollSystem.displayEmployee();
        System.out.println();
        System.out.println("After recession occurred in 2022");
        System.out.println();
        payrollSystem.removeEmployee(2);
        payrollSystem.removeEmployee(103);
        payrollSystem.removeEmployee(4);
        payrollSystem.removeEmployee(105);
        payrollSystem.removeEmployee(101);
        payrollSystem.removeEmployee(5);
        System.out.println("Employee Details after recession: ");
        payrollSystem.displayEmployee();

    }
}
