//parent class
public class Course {
    private String name;
    private int minEngScore;

    //constructor
    public Course(String name, int minEngScore) {
        this.name = name;
        this.minEngScore = minEngScore;
    }

    public String getCourseName() {
        return name;
    }

    public int getMinEngScore() {
        return minEngScore;
    }
}