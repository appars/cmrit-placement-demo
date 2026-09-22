import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void eligibleStudentAtMinimumCGPA() {
        Student student = new Student("Test Student", 5.0, 75.0, 0);

        assertTrue(student.isEligible());
    }

    @Test
    void studentBelowMinimumCGPAIsNotEligible() {
        Student student = new Student("Test Student", 4.9, 75.0, 0);

        assertFalse(student.isEligible());
    }

    @Test
    void studentWithInsufficientAttendanceIsNotEligible() {
        Student student = new Student("Test Student", 5.0, 74.9, 0);

        assertFalse(student.isEligible());
    }

    @Test
    void studentWithBacklogsIsNotEligible() {
        Student student = new Student("Test Student", 5.0, 75.0, 1);

        assertFalse(student.isEligible());
    }
}
