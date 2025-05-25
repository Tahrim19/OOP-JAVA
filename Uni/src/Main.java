/*
Question:
Design a class named Person and its subclasses Student and Employee.
Make Faculty and Staff subclasses of Employee.
A person has a name, address, phone number, and email address.
A student has a class status (First Year, Second Year, Third Year, Final Year).
Define the status as a constant. An employee has an office, salary.
A faculty member has office hours and a rank. A staff member has a title.
Override the toString method in each class to display the class name and the person's name.
Draw the UML diagram for the classes and implement them.
Write a test program that creates a Person, Student, Employee, Faculty, and Staff, and invokes their toString() methods.
*/

public class Main {
    public static void main(String[] args) {
        // Create a Person
        Person person = new Person("John Doe", "123 Main St", "123-456-7890", "john@example.com");
        System.out.println(person.toString());

        // Create a Student
        Student student = new Student("Jane Smith", "456 Elm St", "987-654-3210", "jane@example.com",
                Student.FIRST_YEAR);
        System.out.println(student.toString());

        // Create an Employee
        Employee employee = new Employee("Bob Johnson", "789 Oak Ave", "555-123-4567",
                "bob@example.com", "Building A", 50000.0);
        System.out.println(employee.toString());

        // Create a Faculty member
        Faculty faculty = new Faculty("Alice Brown", "321 Pine Rd", "444-987-6543",
                "alice@example.com", "Building B", 60000.0, "MWF 10AM-12PM", "Professor");
        System.out.println(faculty.toString());

        // Create a Staff member
        Staff staff = new Staff("Charlie Davis", "654 Maple St", "333-789-1234",
                "charlie@example.com", "Building C", 45000.0, "Administrator");
        System.out.println(staff.toString());    }
}