package question5a;

//import javax.swing.JFrame;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        //create a new spiral panel
        Square_Spiral spiral = new Square_Spiral();

        //create a new JFrame to hold the spiral panel
        JFrame frame = new JFrame();

        //add the spiral panel to the frame
        frame.add(spiral);

        //set the size of the frame
        frame.setSize(300, 300);

        //set the default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //make the frame visible
        frame.setVisible(true);
    }
}