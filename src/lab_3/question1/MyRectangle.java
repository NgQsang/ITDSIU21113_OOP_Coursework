package question1;

// Using AWT (Abstract Window Toolkit) to draw shapes
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;

public class MyRectangle extends MyBoundedShape {
    private int width;
    private int height;

    public MyRectangle(int width, int height) {
        // Condition to check if the width or height is invalid
        if (width < 1|| height < 1) {
            System.out.println("Width and height must be greater than 1");
            this.width = 1;
            this.height = 1;
        }
        else {
            this.width = width;
            this.height = height;
        }
    }

    // Overriding the draw method
    @Override
    public void draw() {
        // create a new JFrame object
        JFrame frame = new JFrame();
        // add the rectangle to the frame
        frame.add(new Rectangle());
        // set the size of the frame
        frame.setSize(800, 800);
        // set default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // make the frame visible
        frame.setVisible(true);
    }

    // Overriding the getArea method
    @Override
    public float GetArea() {
        // Formula of the area of an rectangle is a * b (a and b are the width and height)
        return (float) (width * height);
    }

    // Create a class Rectangle that extends Component
    class Rectangle extends Component {
        public void paint (Graphics g) {
            Graphics2D g2d = (Graphics2D) g;// Create a Graphics2D object
            int x = 10;
            int y = 10;
            g2d.drawRect(x, y, width, height);// Draw a rectangle
        }
    }
}
