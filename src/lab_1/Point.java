public class Point {
    //attributes(the coordinates of the point)
    //follow principle of encapsulation
    //because these are 2-point coordinates, I choose the double data type for the Point class.
    private double x;
    private double y;

    //the constructor to get values for x and y of the point
    public Point(double x, double y) {
        this.x = x;
        this.y = y;    
    }
    public double distance(Point target) {
        //to compute the distance from the current point and the given target point.
        //the formula is: d = sqrt((x1 - x2)^2 + (y1 - y2)^2)
        //use Math.sqrt() and Math.pow() methods to calculate the square root and the power of the numbers.
        return Math.sqrt(Math.pow((this.x - target.x), 2) + Math.pow((this.y - target.y), 2));
    }
}