package Models;

import MyInterfaces.ManagerInterface;

public class Manager extends Staff implements ManagerInterface {

    public Manager() {
    }


    public Manager(String firstName, String lastName, int age, char gender, String staffId, String role) {
        super(firstName, lastName, age, gender, staffId, role);
    }

    @Override
    public String hiresCashier(Applicant applicant) {
        if (applicant.getQualification().equals("B.Sc") && applicant.getAge() <= 35 && applicant.getGender() == 'F') {
            return "Congratulations, " + applicant.getFirstName() + "." + " " + "Your application was successful." + "\n"
                    + "You have been offered the job." + "\n" + "You are hereby directed to report at the office for further instructions." + "\n" +
                    "Do accept our heartfelt congratulations.";
        }else {
            return "Application unsuccessful!";
        }
    }
}
