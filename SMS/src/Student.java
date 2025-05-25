import java.util.ArrayList;

public class Student {
    private String name;
    private int studentId;
    private ArrayList<Course> enrolledCourses;

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
        this.enrolledCourses = new ArrayList<>();
        System.out.println("Student created: " + studentId + " - " + name);
    }

    public void addCourse(Course course) {
        enrolledCourses.add(course);
    }

    public void showCourses() {
        System.out.println(name + "'s Enrolled Courses:");
        if (enrolledCourses.isEmpty()) {
            System.out.println("None");
        } else {
            for (Course course : enrolledCourses) {
                System.out.println(course.getCourseCode() + ": " + course.getCourseName());
            }
        }
    }

    public String getName() {
        return name;
    }
}
