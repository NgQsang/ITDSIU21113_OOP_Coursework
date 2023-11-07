package question2;

// Create a class Main to test the Triangle class
public class Main {
    public static void main(String[] args) {
        // test 3 points
        MyPoint p1 = new MyPoint(0, -8);
        MyPoint p2 = new MyPoint(-8, 0);
        MyPoint p3 = new MyPoint(9, 4);

        // test Triangle class
        MyTriangle tri = new MyTriangle(p1, p2, p3);
        // test toString() method
        System.out.println(tri.toString());
        // test getPerimeter() method
        System.out.println("Perimeter: " + tri.getPerimeter());
        // test getType() method
        System.out.println("Type: " + tri.getType());
    }
}
