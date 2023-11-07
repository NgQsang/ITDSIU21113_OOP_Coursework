package question2;

// following the UML diagram
// we need to create a MyPoint class
// with two private attributes: x and y
// with integer data type
// because in front of the attributes, there is a minus sign

public class MyPoint {
    private int x;
    private int y;

    // Constructor
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter and Setter
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    // GetDistance() method
    public double GetDistance(MyPoint target) {
        return Math.sqrt(Math.pow(x - target.x, 2) + Math.pow(y - target.y, 2));
    }
}
