public class Student {

    private String name;
    private double cgpa;
    private double attendance;
    private int backlogs;

    public Student(String name, double cgpa, double attendance, int backlogs) {
        this.name = name;
        this.cgpa = cgpa;
        this.attendance = attendance;
        this.backlogs = backlogs;
    }

    public boolean isEligible() {
        return cgpa >= 7.0 &&
               attendance >= 75.0 &&
               backlogs == 0;
    }

    public void displayResult() {
        System.out.println("Student: " + name);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Attendance: " + attendance);
        System.out.println("Backlogs: " + backlogs);

        if (isEligible()) {
            System.out.println("Placement Eligibility: ELIGIBLE");
        } else {
            System.out.println("Placement Eligibility: NOT ELIGIBLE");
        }
    }

    public static void main(String[] args) {

        Student student =
                new Student("Rahul", 7.8, 82.0, 0);

        student.displayResult();
    }
}
