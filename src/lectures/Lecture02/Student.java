package lectures.Lecture02;

public class Student extends Person {
    private int studentId;
    private String course;

    public Student(String firstName, String lastName, long contactNo, int studentId, String course) {
        super(firstName, lastName, contactNo);
        this.studentId = studentId;
        this.course = course;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
