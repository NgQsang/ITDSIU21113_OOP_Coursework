package question3;

// following the UML diagram

public class Person {
    private String name;// front of the attribute, there is a minus sign
    private String address;//... same as above
    
    // the plus sign in front of the method means public
    // constructor
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // getter and setter
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // toString() method
    // using String.format() method
    public String toString() {
        return String.format("Person[name=%s, address=%s]", name, address);
    }
}

