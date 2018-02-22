package lectures.Lecture02;

public class PersonTester {
    public static void main(String[] args){
        Student student1 = new Student("Sanjula", "Madurapperuma",
                552, 001, "SE");

        Lecturer lecturer1 = new Lecturer("Torin", "Weerasinghe",
                8896, 003, "Management");

        System.out.println("Student Details");
        System.out.println("Student ID : " + student1.getStudentId());
        System.out.println("First Name : " + student1.getFirstName());
        System.out.println("Last Name : " + student1.getLastName());
        System.out.println("Contact No : " + student1.getContactNo());
        System.out.println("Course : " + student1.getCourse());


        System.out.println();
        System.out.println("Lecturer details");
        System.out.println("Lecturer ID : " + lecturer1.getEmployeeId());
        System.out.println("First Name : " + lecturer1.getFirstName());
        System.out.println("Last Name : " + lecturer1.getLastName());
        System.out.println("Contact No : " + lecturer1.getContactNo());
        System.out.println("Department : " + lecturer1.getDepartment());
    }
}
