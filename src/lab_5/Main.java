import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
        int _123 = 123 - 1900;
        Employee sang = new Employee("1", "Sang", 20, 2, 2);
        Employee son = new Employee("2", "Son", 18, 5, 2);
        Employee dat = new Employee("3", "Dat", 17, 3, 5);
        Employee minh = new Employee("4", "Minh", 15, 6, 8);

        ArrayList<Employee> employee1 = new ArrayList<>(Arrays.asList(sang, son, dat));
        ArrayList<Employee> employee2 = new ArrayList<>(Arrays.asList(son, dat, minh));

        Project project1 = new Project("1", 
        new Date(123, Calendar.JANUARY, 1), 
        new Date(123, Calendar.FEBRUARY, 28), 
        employee1);

        Project project2 = new Project("2",
        new Date(123, Calendar.NOVEMBER, 1),
        new Date(123, Calendar.DECEMBER, 31),
        employee2);

        new ProjectPrinter(project1).run();
        new ProjectPrinter(project2).run();
    }
}