package org.example;

public interface IManager {
    // A Manager can increaseSalary, hireEmployee, fireEmployee, and getNumberOfEmployeesSupervised
    // Please implement these methods
    public void increaseSalary(Employee emp, double amount);
    public void hireEmployee(Employee emp);
    public void fireEmployee(Employee emp);
    public int getNumberOfEmployeesSupervised();
}
