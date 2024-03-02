// Following as the UML diagram
public class Employee implements Comparable<Employee>{

    private String employeeId;
    private String employeeName;
    private int salaryPerHour;
    private int noOfLeavingDay;
    private int noOfTravelDay;

    // Constructor
    public Employee(String employeeId, String employeeName, int salaryPerHour, int noOfLeavingDay, int noOfTravelDay) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salaryPerHour = salaryPerHour;
        this.noOfLeavingDay = noOfLeavingDay;
        this.noOfTravelDay = noOfTravelDay;
    }

    // Getter and Setter
    public String getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setSalaryPerHour(int salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    // Second constructor to Compare in the CompareTo() method
    public Employee(String employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    // Methods
    // CalculateWeeklySalary() method
    // The formula is Weekly Salary = salaryPerHour * 8 *(5 - noOfLeavingDay + noOfTravelDay/2)
    public int calculateWeeklySalary() {
        return salaryPerHour * 8 * (5 - noOfLeavingDay + noOfTravelDay / 2);
    }

    // CompareTo() method
    // Follow the UML diagram, this method is implemented from Comparable interface
    // This override method is used to compares 2 Employee objects
    @Override
    public int compareTo(Employee e) {
        //if noOfTravelDay of the first object is greater than the second object, the first employee is ranked higher than the second employee
        if (this.noOfTravelDay > e.noOfTravelDay) {
            return 1;
        }
        //if noOfTravelDay of the first object is less than the second object, the first employee is ranked lower than the second employee
        if (this.noOfTravelDay < e.noOfTravelDay) { 
            return 0;
        }
        if (this.noOfLeavingDay > e.noOfLeavingDay) {
            return -1;
        }
        return 0;
    }

    //toString() method
    //This override method return a String format of an employee as follows:
    public String toString() {
        return String.format("[Name: %s - Salary Per Hour: %d - Weekly Salary: %d]", employeeName, salaryPerHour, calculateWeeklySalary());
    }

    
}
