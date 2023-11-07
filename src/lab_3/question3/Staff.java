package question3;


// following the UML diagram

public class Staff extends Person {
    private String school;
    private double pay;

    // constructor
    public Staff(String name, String address, String school, double pay) {
        // super() method
        // call the constructor of the superclass
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    // getter and setter
    public String getSchool() {
        return school;
    }
    public double getPay() {
        return pay;
    }

    public void setSchool(String school) {
        this.school = school;
    }
    public void setPay(double pay) {
        this.pay = pay;
    }

    // toString() method
    // using String.format() method
    public String toString() {
        return String.format("Staff[Person[name=%s, address=%s], school=%s, pay=%.2f]", getName(), getAddress(), school, pay);
    }
}
