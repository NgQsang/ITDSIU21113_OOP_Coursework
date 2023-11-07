package question3;

// following the UML diagram

public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    // constructor
    public Student(String name, String address, String program, int year, double fee) {
        // super() method
        // call the constructor of the superclass
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    // getter and setter
    public String getProgram() {
        return program;
    }
    public int getYear() {
        return year;
    }
    public double getFee() {
        return fee;
    }

    public void setProgram(String program) {
        this.program = program;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setFee(double fee) {
        this.fee = fee;
    }

    // toString() method
    // using String.format() method
    public String toString() {
        return String.format("Student[Person[name=%s, address=%s], program=%s, year=%d, fee=%.2f]", getName(), getAddress(), program, year, fee);
    }
}
