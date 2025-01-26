public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName(){
        return firstName+" "+lastName;
    }

    public int getSalary() {
        return salary;
    }
    public int setSalary(){
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getAnnualSalary(){
        return salary*12;
    }

    public int raiseSalary(int percent) {
        int currentSalary = getSalary();
        double raiseAmount = (currentSalary * percent) / 100.0;
        return (int) (currentSalary + raiseAmount);
    }

    @Override
    public String toString(){
        return "Employee[id="+id+",name="+getName()+",salary="+getSalary()+"]";
    }
}
