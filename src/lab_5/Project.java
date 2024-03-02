//Following as the UML diagram
//import java.util.ArrayList;
//import java.util.Date;
import java.util.Date;
import java.util.ArrayList;


public class Project {
    
    // Attributes
    private String projectId;
    private Date startDate;
    private Date endDate;
    private ArrayList<Employee> listOfEmployee = new ArrayList<>();

    // getter and setter
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public ArrayList<Employee> getListOfEmployee() {
        return listOfEmployee;
    }

    public void setListOfEmployee(ArrayList<Employee> listOfEmployee) {
        this.listOfEmployee = listOfEmployee;
    }

    // Constructor
    public Project(String projectId, Date startDate, Date endDate, ArrayList<Employee> listOfEmployee) {
        this.projectId = projectId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.listOfEmployee = listOfEmployee;
    }

    // Methods
    // estimateBudget() method
    // The estimate budget is calculated based on the salary per hour of each employee
    // from startDate to endDate. We make assumption that the noOfLeavingDay and noOfTravelDay are zero
    public int estimateBudget() {
        int budget = 0;
        for (Employee e : listOfEmployee) {
            budget += (startDate.getTime() - endDate.getTime()) / (1000 * 60 * 60 * 24) * e.getSalaryPerHour();
        }
        return budget;
    }

    // toString() method
    // This override method return a list of employees by accending order
    @Override
    public String toString() {
        listOfEmployee.sort(null);
        String listOfEmployee  = "";
        for (Employee e : this.listOfEmployee) {
            listOfEmployee += e.getEmployeeName() + "\n";
        }
        return listOfEmployee;
    }
}
