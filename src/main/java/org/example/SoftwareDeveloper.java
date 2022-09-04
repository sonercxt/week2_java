package org.example;


public class SoftwareDeveloper extends Employee implements ISoftwareDeveloper{
    // A Manager has Supervisor, skills, experience attribute additionally.
    // Please implement necessary methods to get and set these attributes of Manager

    private String Supervisor;
    private String skills;
    private int experience;

    public SoftwareDeveloper (int pId, String pFirstName, String pLastName, int pAge, double pSalary, String pDepartment, String pSupervisor, String pSkills, int pExperience){
        super(pId, pFirstName, pLastName, pAge, pSalary, pDepartment);
       this.Supervisor = pSupervisor;
       this.skills = pSkills;
       this.experience = pExperience;
    }

    public String getSupervisor() {
        return Supervisor;
    }

    public void setSupervisor(String supervisor) {
        Supervisor = supervisor;
    }

    public String getSkills() {
        return skills;
    }


    public void setSkills(String skills) {
        this.skills = skills;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public void writeCode() {

    }

    @Override
    public void testCode() {

    }

    @Override
    public void pushChanges() {

    }
}
