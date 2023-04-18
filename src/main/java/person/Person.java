package person;

public abstract class Person {
    private String name;
    private byte age;
    private String address;
    private String phone;

    public Person(String name, byte age, String address, String phone) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

    public  Person() {};

    public byte getAge() {
        return age;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public String getPhone(){
        return phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


}
