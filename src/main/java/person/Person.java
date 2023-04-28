package person;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import exceptions.NullValueException;

public abstract class Person {
    private static final Logger LOGGER = LogManager.getLogger();
    protected String name;
    protected byte age;
    protected String address;
    protected String phone;

    public Person() {
    }

    public Person(String name, byte age, String address, String phone) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

    public Person(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public String getName() {
        this.name = name;
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public void setName(String name) throws NullValueException {

        if (name =="" || name ==" ")
        {throw new NullValueException();}
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


}
