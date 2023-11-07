package question2;

// following the UML diagram
// we need to create a Triangle class
// with three private attributes: v1, v2 and v3
// with MyPoint data type already defined in MyPoint.java (realated to UML diagram)
// because in front of the attributes, there is a minus sign

// following the UML diagram
// we also need to create 2 constructors Triangle()
// 3 methods: getPerimeter(), getType() and toString()

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    // set the attributes for the sides of the triangle
    private double d1;
    private double d2;
    private double d3;

    // First constructor
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1 = new MyPoint(x1, y1);
        v2 = new MyPoint(x2, y2);
        v3 = new MyPoint(x3, y3);
        d1 = v1.GetDistance(v2);
        d2 = v2.GetDistance(v3);
        d3 = v3.GetDistance(v1);
    }

    // Second constructor
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
        d1 = v1.GetDistance(v2);
        d2 = v2.GetDistance(v3);
        d3 = v3.GetDistance(v1);

    }

    // toString() method
    public String toString() {
        // using String.format() method
        // also following the UML diagram
        // type: String
        // MyTriangle[v1=(x1, y1), v2=(x2, y2), v3=(x3, y3)]
        return String.format("MyTriangle[v1=(%d, %d), v2=(%d, %d), v3=(%d, %d)]", v1.getX(), v1.getY(), v2.getX(), v2.getY(), v3.getX(), v3.getY());
    }

    // getPerimeter() method
    // also following the UML diagram
    // type: double
    // using MyPoint's GetDistance() method to compute the length of edges
    public double getPerimeter() {
        return d1 + d2 + d3;
    }

    // getType() method
    // also following the UML diagram
    // type: String
    // using if-else statement to check the type of triangle

    public String getType() {     
        //check if the triangle is equilateral
        //all three sides of the triangle have equal length.
        if (d1 == 2 && d2 == d3) {
            return "Equilateral Triangle";
        }
        //check if the triangle is isoscelesq
        //two any sides of the triangle have equal length.
        else if (d1 == d2 || d1 == 3 || d2 == d3) {
            return "Isosceles Triangle";
        }
        //check if the triangle is scalene
        //all three sides of the triangle have different lengths.
        else {
            return "Scalene Triangle";
        }    
    }
}
