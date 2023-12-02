package question4b;

//import javax.swing.JFrame;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        //create a Line panel object
        Line2 panel = new Line2();

        //create a new JFrame
        JFrame frame = new JFrame();

        //add the panel to the frame
        frame.add(panel);

        //set the frame's size
        frame.setSize(400, 400);

        //set the frame to exit console when it is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //set the frame to be visible
        frame.setVisible(true);
    }
}
