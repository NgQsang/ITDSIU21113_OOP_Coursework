public class Triangle {
    //attributes(the lengths of the three sides of the triangle) 
    //follow principle of encapsulation
    //because the articles do not mentioned the data type, 
    //but this is a Triangle, so I will choose an double data type for the Rectangle class.
    private double side1;
    private double side2;
    private double side3;
    
    //constructor with three parameters
    public Triangle(double side1, double side2, double side3) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }
    //getters methods
    public double getSide1() {
        return side1;
    }
    public double getSide2() {
        return side2;
    }
    public double getSide3() {
        return side3;
    }

    //method String verify() to check and return a type of triangle
    //the types can be Not Triangle, Equilateral, Isosceles or Scalene
    public String verify() {
        //check if the triangle is not a triangle
        //the sum of the lengths of any two sides of a triangle is greater than the length of the third side.
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            return "Not Triangle";
        }
        //check if the triangle is equilateral
        //all three sides of the triangle have equal length.
        else if (side1 == side2 && side2 == side3) {
            return "Equilateral Triangle";
        }
        //check if the triangle is isoscelesq
        //two any sides of the triangle have equal length.
        else if (side1 == side2 || side1 == side3 || side2 == side3) {
            return "Isosceles Triangle";
        }
        //check if the triangle is scalene
        //all three sides of the triangle have different lengths.
        else {
            return "Scalene Triangle";
        }    
    }
}