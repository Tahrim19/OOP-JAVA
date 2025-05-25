public class Main {
    public static void main(String[] args) {
        // Creating students
        Student s1 = new Student("Alice", 1);
        Student s2 = new Student("Bob", 2);

        // Creating courses
        Course c1 = new Course("Intro to Java", "CS101", 30);
        Course c2 = new Course("Data Structures", "CS201", 25);

        // Linking students and courses manually
        s1.addCourse(c1);
        c1.addStudent(s1);

        s2.addCourse(c1);
        c1.addStudent(s2);

        s1.addCourse(c2);
        c2.addStudent(s1);

        // Displaying data
        s1.showCourses();
        s2.showCourses();

        c1.showStudents();
        c2.showStudents();
    }
}