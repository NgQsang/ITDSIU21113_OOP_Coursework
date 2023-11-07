package question4;

// following the UML diagram

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    // first constructor
    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // second constructor
    public Point2D() {}

    // getter and setter
    public float getX() {
        return x;
    }
    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }
    public void setY(float y) {
        this.y = y;
    }

    // also following the UML diagram
    // we have to return an array of float
    public float[] getXY() {
        float[] arr = new float[2];
        arr[0] = x;
        arr[1] = y;
        return arr;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // toString method()
    // using the String.format() method
    public String toString() {
        return String.format("(%.2f, %.2f)", x, y);
    }
}
