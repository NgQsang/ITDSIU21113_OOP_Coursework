package question3b;

//import javax.swing.JFrame;
import javax.swing.JFrame;

public class Main {
    public static void main(String[]args){
        //create a Line panel object
        Line2 panel = new Line2();

        //create a JFrame to hold the panel
        JFrame jframe = new JFrame();

        //add the panel to the frame
        jframe.add(panel);

        //set the frame's size
        jframe.setSize(300, 300);

        //set the frame to exit consloe when it is closed
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //set the frame to be visible
        jframe.setVisible(true);
    }
}
