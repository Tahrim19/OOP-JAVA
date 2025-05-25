public class Employee extends Person{
    String office;
    double salary;
    public Employee(String name, String address, String phoneNum, String email, String office, double salary){
        super(name, address, phoneNum, email);
        this.salary=salary;
        this.office=office;
    }
    @Override
    public String toString() {
        return "Employee: " + name + ", Office: " + office + ", Salary: " + salary;
    }
}
