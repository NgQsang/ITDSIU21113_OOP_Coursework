package question1;

// Using AWT (Abstract Window Toolkit) to draw shapes
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;

// MyLine is a subclass of MyShape
// MyLine is concrete class
public class MyLine extends MyShape {
    private int length;

    // Constructor
    public MyLine(int length) {
        // Condition to check if the length is invalid
        if (length < 1) {
            System.out.println("Length must be greater than 1");
            this.length = 1;
        }
        else {
            this.length = length;
        }
    }

    // Getter
    public int getLength() {
        return length;
    }

    // Setter
    public void setLenght(int length) {
        this.length = length;
    }

    // Overriding the draw method
    @Override
    public void draw() {
        // create a new JFrame object
        JFrame frame = new JFrame();
        // add the line to the frame
        frame.add(new Line());
        // set the size of the frame
        frame.setSize(800, 800);
        // set default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // make the frame visible
        frame.setVisible(true);
    }

    // Create a class Line that extends Component
    class Line extends Component {
        public void paint(Graphics g) { 
            Graphics2D g2d = (Graphics2D) g;// Create a Graphics2D object
            int x = 10;
            int y = 10;
            g2d.drawLine(x, y, x + length, y);// Draw a line
        }
    }
}
