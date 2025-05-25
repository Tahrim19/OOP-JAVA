public class Person{
    String name;
    String address;
    String phoneNum;
    String email;
    public Person(String name, String address, String phoneNum, String email){
        this.name=name;
        this.address=address;
        this.email=email;
        this.phoneNum=phoneNum;
    }
    @Override
    public String toString(){
        return "Person: " + name;
    }
}
