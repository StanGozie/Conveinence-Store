package models;

public abstract class Staff extends Person {

    private String staffId;
    private String role;

    public Staff() {
    }

    public Staff(String firstName, String lastName, int age, char gender, String staffId, String role) {
        super(firstName, lastName, age, gender);
        this.staffId = staffId;
        this.role = role;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
