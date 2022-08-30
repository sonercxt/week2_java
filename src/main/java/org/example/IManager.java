package org.example;

public interface IManager {
    // A Manager can increaseSalary, hireEmployee, fireEmployee, and getNumberOfEmployeesSupervised
    // Please implement these methods

    public void getNumberOfEmployeesSupervised();
    void hireEmployee(Employee emp);
    void increaseSalary(Employee emp, double amount);
    public void fireEmployee(Employee emp);

}
