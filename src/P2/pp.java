package P2;

import java.util.ArrayList;
import java.util.List;

public class pp {

    // ===== Student class =====
    static class Student {
        // Attributes
        private String studentID;
        private String name;
        private String course;
        private int yearLevel;
        private String enrollmentStatus; // "Active" or "Inactive"
        private List<String> enrolledSubjects;

        // Parameterized constructor
        public Student(String studentID, String name, String course, int yearLevel, String enrollmentStatus) {
            this.studentID = studentID;
            this.name = name;
            this.course = course;
            this.yearLevel = yearLevel;
            this.enrollmentStatus = enrollmentStatus;
            this.enrolledSubjects = new ArrayList<>();
        }

        // Enroll in a subject - only allowed if status is Active
        public void enrollSubject(String subject) {
            if (!enrollmentStatus.equalsIgnoreCase("Active")) {
                System.out.println("Enrollment failed: " + name + "'s status is not Active.");
                return;
            }
            if (enrolledSubjects.contains(subject)) {
                System.out.println(name + " is already enrolled in " + subject + ".");
                return;
            }
            enrolledSubjects.add(subject);
            System.out.println(name + " successfully enrolled in " + subject + ".");
        }

        // Drop a subject - prevent if no subjects are enrolled
        public void dropSubject(String subject) {
            if (enrolledSubjects.isEmpty()) {
                System.out.println("Drop failed: " + name + " has no enrolled subjects.");
                return;
            }
            if (enrolledSubjects.remove(subject)) {
                System.out.println(name + " successfully dropped " + subject + ".");
            } else {
                System.out.println(name + " is not enrolled in " + subject + ".");
            }
        }

        // Display current enrollment information
        public void displayInfo() {
            System.out.println("----------------------------------------");
            System.out.println("Student ID       : " + studentID);
            System.out.println("Name             : " + name);
            System.out.println("Course           : " + course);
            System.out.println("Year Level       : " + yearLevel);
            System.out.println("Enrollment Status: " + enrollmentStatus);
            System.out.println("Subjects Enrolled: " + enrolledSubjects.size());
            System.out.println("Subjects List    : " + enrolledSubjects);
            System.out.println("----------------------------------------");
        }

        // Getters/setters (optional utility methods)
        public String getEnrollmentStatus() {
            return enrollmentStatus;
        }

        public void setEnrollmentStatus(String enrollmentStatus) {
            this.enrollmentStatus = enrollmentStatus;
        }

        public int getSubjectCount() {
            return enrolledSubjects.size();
        }
    }

    // ===== Main class - creates objects and performs transactions =====
    public static void main(String[] args) {

        // Creating different student objects with different information
        Student student1 = new Student("2023-0001", "Juan Dela Cruz", "BS Computer Science", 2, "Active");
        Student student2 = new Student("2023-0002", "Maria Santos", "BS Information Technology", 1, "Inactive");

        // Perform enrollment transactions for student1
        student1.enrollSubject("Data Structures");
        student1.enrollSubject("Discrete Mathematics");
        student1.dropSubject("Data Structures");
        student1.displayInfo();

        // Perform enrollment transactions for student2 (Inactive status)
        student2.enrollSubject("Web Development"); // should fail, status is Inactive
        student2.dropSubject("Web Development");   // should fail, no subjects enrolled
        student2.displayInfo();
    }
}




