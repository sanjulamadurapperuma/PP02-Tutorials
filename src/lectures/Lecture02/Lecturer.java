package lectures.Lecture02;

public class Lecturer extends Person {
    private int employeeId;
    private String department;

    public Lecturer(String fName, String lName, long contactNo, int employeeId, String department) {
        super(fName, lName, contactNo);
        this.employeeId = employeeId;
        this.department = department;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
