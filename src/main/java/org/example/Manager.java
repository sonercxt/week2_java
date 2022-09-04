package org.example;

public class Manager extends Employee implements IManager{

    // A Manager has numberOfEmployeesSupervised attribute additionally.
    // Please implement necessary methods to get and set these attributes of Manager

    // Manager(id, firstName, lastName, age, salary, department)

    private int numberOfEmployeesSupervised;
    public Manager(int pId, String pFirstName, String pLastName, int pAge, double pSalary, String pDepartment) {
        super(pId, pFirstName, pLastName, pAge, pSalary, pDepartment);
        this.numberOfEmployeesSupervised = numberOfEmployeesSupervised;
    }

    @Override
    public void increaseSalary(Employee emp, double amount) {
        System.out.println(emp.getFirstName() + " increaseSalary" + amount);
    }

    @Override
    public void hireEmployee(Employee emp) {
        System.out.println(emp.getFirstName() + " " + emp.getLastName() + "is hired");
    }

    @Override
    public void fireEmployee(Employee emp) {
        System.out.println(emp.getFirstName() + " " + emp.getLastName() + " is fired" );
    }

    @Override
    public int getNumberOfEmployeesSupervised() {
        System.out.println(this.getFirstName()+" has "+numberOfEmployeesSupervised+" employees");
        return numberOfEmployeesSupervised;
    }

    public void setNumberOfEmployeesSupervised(int numberOfEmployeesSupervised) {
        this.numberOfEmployeesSupervised = numberOfEmployeesSupervised;
    }

    public void getEmployees() {
        System.out.println("Emloyees" + this.getFirstName() + this.getLastName());
    }
}
