// Import necessary libraries
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class ProjectPrinter implements Runnable{
    // Attributes
    private Project project;

    // Constructor
    public ProjectPrinter(Project project) {
        this.project = project;
    }

    // run() method
    // This override method prints out each listOfEmployee. After printing out one employee, a thread is delayed for 1 second
    // The result is shown by the following format:
    // [Project ID: aa - Project Duration::dd/mm/yyyy to dd/mm/yyyy] [Name:xx - Salary Per Hour:yy]
    @Override
    public void run() {
        ArrayList<Employee> employees = project.getListOfEmployee();
        SimpleDateFormat simpleDate = new SimpleDateFormat("dd/MM/yyyy");
        for (Employee e : employees) {
            System.out.println(String.format(
                    "[Project ID: %s - Project Duration: %s to %s][Name: %s - Salary Per Hour: %s]",
                    project.getProjectId(),
                    simpleDate.format(project.getStartDate()),
                    simpleDate.format(project.getEndDate()),
                    e.getEmployeeName(),
                    e.getSalaryPerHour()
            ));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
        }
        System.out.println();
    }
}
