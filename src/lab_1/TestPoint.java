public class TestPoint {
    public static void main(String[] args) {
        //instantiate 5 different points
        Point p1 = new Point(10, 5);
        Point p2 = new Point(20, 20);
        Point p3 = new Point(40, 20);
        Point p4 = new Point(60, 40);
        Point p5 = new Point(5, 5);

        //check the distance method()
        double distance1 = p1.distance(p2);
        double distance2 = p1.distance(p3);
        double distance3 = p1.distance(p4);
        double distance4 = p1.distance(p5);
        
        //distance between p1 and p2 respectively 5 different points
        System.out.println("The distance between p1 and p2 is " + distance1);
        System.out.println("The distance between p1 and p3 is " + distance2);
        System.out.println("The distance between p1 and p4 is " + distance3);
        System.out.println("The distance between p1 and p5 is " + distance4);

    }
}