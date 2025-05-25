public class Staff extends Employee{
    String title;

    public Staff(String name, String address, String phoneNum, String email,String office, double salary, String title) {
        super(name, address, phoneNum, email, office, salary);
        this.title = title;
    }
    @Override
    public String toString(){
        return "Staff: " + name + "Title: " + title;
    }
}
