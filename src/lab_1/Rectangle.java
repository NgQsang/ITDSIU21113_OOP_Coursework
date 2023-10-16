public class Rectangle {
    //1)two attributes width and height with appropriate getters methods

    //follow principle of encapsulation
    //because the articles do not mentioned the data type, 
    //but this is a Rectangle, so I will choose an integer data type for the Rectangle class.
    private int width;
    private int height;

    //2)a constructor that requires values for width and height of the rectangle. 
    //If either of the inputs is negative, print an error message and set the corresponding attribute to 1.

    //constructor with two parameters
    public Rectangle(int width, int height) {
        //if width or height is negative, print error message and set width and height to 1
        if (width < 0 || height < 0) {
            System.out.println("Error: value of width or height cannot be negative");
            this.width = 1;
            this.height = 1;
        } else {
            this.width = width;
            this.height = height;
            //"this" is used to disambiguate between the instance variables (the fields of the class) 
            //and the parameters passed to the constructor.
        }
    }
    //getters methods
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }

    //3) a visualize method to display the rectangle using * symbol
    public void visualize() {
        //outer loop(iterating over the rows of the rectangle.)
        for (int i = 0; i < height; i++) {
            //inner loop(iterating over the columns of the rectangle.)
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            //used to move to the next line in the console
            System.out.println();
        }
    }
}