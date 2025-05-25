import java.util.ArrayList;

public class Course {
    private String courseName;
    private String courseCode;
    private int maxCapacity;
    private ArrayList<Student> enrolledStudents;

    public Course(String courseName, String courseCode, int maxCapacity) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.maxCapacity = maxCapacity;
        this.enrolledStudents = new ArrayList<>();
        System.out.println("Course created: " + courseCode + " - " + courseName);
    }

    public void addStudent(Student student) {
        enrolledStudents.add(student);
    }

    public void showStudents() {
        System.out.println("Students in " + courseCode + " - " + courseName + ":");
        if (enrolledStudents.isEmpty()) {
            System.out.println("No students enrolled.");
        } else {
            for (Student student : enrolledStudents) {
                System.out.println(student.getName());
            }
        }
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }
}
