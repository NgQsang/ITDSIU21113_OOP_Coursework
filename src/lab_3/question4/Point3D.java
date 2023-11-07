package question4;

public class Point3D extends Point2D {
    private float z = 0.0f;

    // first constructor
    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    // second constructor
    public Point3D() {}

    // getter and setter
    public float getZ() {
        return z;
    }
    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        float[] arr = new float[3];
        arr[0] = super.getX();
        arr[1] = super.getY();
        arr[2] = z;
        return arr;
    }

    public void setXYZ(float x, float y, float z) {
        super.setX(x);
        super.setY(y);
        this.z = z;
    }

    // toString method()
    // using the String.format() method
    public String toString() {
        return String.format("(%.2f, %.2f, %.2f)", super.getX(), super.getY(), z);
    }
}
