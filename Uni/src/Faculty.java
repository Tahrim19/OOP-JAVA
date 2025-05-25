public class Faculty extends Employee{
    String officeHours;
    String rank;
    public Faculty(String name, String address, String phoneNum, String email, String office, double salary, String officeHours, String rank) {
        super(name, address, phoneNum, email, office, salary);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public String toString(){
        return "Employee: " + name + ", Office: " + office + ", Salary: " + salary;
    }
}
