public class Student extends Person{
    String classStatus;
    public static final String FIRST_YEAR="First Year";
    public static final String SECOND_YEAR="Second Year";
    public static final String THIRD_YEAR="Third Year";
    public static final String FOURTH_YEAR="Fourth Year";

    public Student(String name, String address, String phoneNum, String email, String classStatus){
        super(name,address,phoneNum,email);
        this.classStatus=classStatus;
    }
    @Override
    public String toString(){
        return "Student: " + name +", Class Status: "+classStatus;
    }
}
