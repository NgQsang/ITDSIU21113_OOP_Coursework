public class Main {
    public static void main(String[] args) {
        Student studentgrA = new Student(90);
        Student studentgrB = new Student(75);
        Student studentgrC = new Student(50);

        //create course objects
        EngCourse engCourse = new EngCourse("IE1", 79);
        PTCourse ptCourse = new PTCourse("PT1", 75);
        EngCourse engCourse2 = new EngCourse("EE1", 59);

        CourseRegistration registration = new CourseRegistration();

        System.out.println("Student in Group A can register for IE1: " + registration.register(studentgrA, engCourse));
        System.out.println("Student in Group B can register for PT1: " + registration.register(studentgrB, ptCourse));
        System.out.println("Student in Group C can register for EE1: " + registration.register(studentgrC, engCourse2));
    }
}