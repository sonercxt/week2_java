package org.example;


public class SoftwareDeveloper extends Employee implements ISoftwareDeveloper{
    // A Manager has Supervisor, skills, experience attribute additionally.
    // Please implement necessary methods to get and set these attributes of Manager

    private Manager supervisor;
    private int experience;
    private String skills;


    public SoftwareDeveloper(int pId,String pFirstName,String pLastName,int pAge,double pSalary,String pDepartment,Manager pSupervisor,String pSkills,int pExperience){
        this.supervisor = pSupervisor;
        this.skills = pSkills;
        this.experience = pExperience;
    }

    public Manager getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Manager supervisor) {
        this.supervisor = supervisor;
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
}
