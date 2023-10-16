//class TestTriangle with a main method to instantiate 5 different triangles and verify them.
public class TestTriangle {
    public static void main(String[] args) {
        //instantiate 5 different triangles
        Triangle t1 = new Triangle(10, 5, 6);
        Triangle t2 = new Triangle(20, 20, 20);
        Triangle t3 = new Triangle(40, 20, 20);
        Triangle t4 = new Triangle(60, 40, 40);
        Triangle t5 = new Triangle(5, 5, 5);

        //verify them
        System.out.println("t1 is " + t1.verify());
        System.out.println("t2 is " + t2.verify());
        System.out.println("t3 is " + t3.verify());
        System.out.println("t4 is " + t4.verify());
        System.out.println("t5 is " + t5.verify());
    }
}