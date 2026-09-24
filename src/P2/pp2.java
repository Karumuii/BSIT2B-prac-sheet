package P2;

// Activity : Student Enrollment System (Problem 3)
public class pp2 {

    static class Student {
        String studentID;
        String name;
        String course;
        int yearLevel;
        String enrollmentStatus; // "Active" or "Inactive"
        int subjectsEnrolled;

        Student(String studentID, String name, String course, int yearLevel, String enrollmentStatus) { //Constructor with Parameter
            this.studentID = studentID;
            this.name = name;
            this.course = course;
            this.yearLevel = yearLevel;
            this.enrollmentStatus = enrollmentStatus;
            this.subjectsEnrolled = 0; //initialized immediately upon registration
        }

        void enroll() {
            if (!enrollmentStatus.equalsIgnoreCase("Active")) {
                System.out.println(name + " cannot enroll. Status is not Active.");
                return;
            }
            subjectsEnrolled++;
            System.out.println(name + " enrolled in a subject. Total subjects: " + subjectsEnrolled);
        }

        void drop() {
            if (subjectsEnrolled == 0) {
                System.out.println(name + " cannot drop. No enrolled subjects.");
                return;
            }
            subjectsEnrolled--;
            System.out.println(name + " dropped a subject. Total subjects: " + subjectsEnrolled);
        }

        void display() {
            System.out.println("> Student ID: " + studentID);
            System.out.println("> Name: " + name);
            System.out.println("> Course: " + course);
            System.out.println("> Year Level: " + yearLevel);
            System.out.println("> Status: " + enrollmentStatus);
            System.out.println("> Subjects Enrolled: " + subjectsEnrolled);
            System.out.println("------------------------------");
        }
    }

    Student student1;
    Student student2;

    void createStudents() {
        student1 = new Student("2023-0001", "Juan Dela Cruz", "BS Computer Science", 2, "Active");
        student2 = new Student("2023-0002", "Maria Santos", "BS Information Technology", 1, "Inactive");
    }

    public static void main(String[] args) {
        pp2 se = new pp2();
        se.createStudents();

        se.student1.enroll();
        se.student1.enroll();
        se.student1.drop();
        se.student1.display();

        se.student2.enroll(); // will fail, status is Inactive
        se.student2.drop();   // will fail, no subjects enrolled
        se.student2.display();
    }
}



