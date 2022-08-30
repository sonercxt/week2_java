package org.example;

public class Manager extends Employee implements IManager{

    // A Manager has numberOfEmployeesSupervised attribute additionally.
    // Please implement necessary methods to get and set these attributes of Manager

    private int numberOfEmployeesSupervised;

    public Manager(int pId, String pFirstName, String pLastName, int pAge, double pSalary, String pDepartment){
        this.numberOfEmployeesSupervised = 0;
    }

    public int getNumberOfEmployeesSupervised() {
        return numberOfEmployeesSupervised;
    }

    public void setNumberOfEmployeesSupervised(int numberOfEmployeesSupervised) {
        this.numberOfEmployeesSupervised = numberOfEmployeesSupervised;
    }

}
