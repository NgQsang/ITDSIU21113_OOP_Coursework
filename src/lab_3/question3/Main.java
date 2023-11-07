package question3;

public class Main {
    public static void main(String[] args) {
        // create a new object to test
        Person person = new Person("Sang", "Ben Tre");
        Student student = new Student("Sang", "Ben Tre", "Data Science", 2021, 3400.0);
        Staff staff = new Staff("Son", "Bien Hoa", "IU", 1000.0);

        // print the object
        System.out.println(person);
        System.out.println(student);
        System.out.println(staff);
    }
}
