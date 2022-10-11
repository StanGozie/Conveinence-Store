package models;

import interfaces.ApplicantInterface;

public class Applicant extends Person implements ApplicantInterface{

    private String qualification;
    private String applicantId;

    private String roleAppliedFor;


    public Applicant() {
    }

    public Applicant(String firstName, String lastName, int age, char gender, String qualification, String applicantId, String roleAppliedFor) {
        super(firstName, lastName, age, gender);
        this.qualification = qualification;
        this.applicantId = applicantId;
        this.roleAppliedFor = roleAppliedFor;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(String applicantId) {
        this.applicantId = applicantId;
    }

    public String getRoleAppliedFor() {
        return roleAppliedFor;
    }

    public void setRoleAppliedFor(String roleAppliedFor) {
        this.roleAppliedFor = roleAppliedFor;
    }

    @Override
    public String toString() {
        return "Applicant{" +
                "qualification='" + qualification + '\'' +
                ", applicantId='" + applicantId + '\'' +
                '}';
    }


    @Override
 public String applyForJob(Applicant applicant) {

     String applicationStatus = "You have succeeded with your application.";

        return applicationStatus;
    }


}

