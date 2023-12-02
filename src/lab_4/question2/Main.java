package question2;

//creating a JFrame to display the DrawPanel
//import javax.swing.JFrame;
import javax.swing.JFrame;

public class Main {
    public static void main(String[]args){
        //create a DrawPanel object
        DrawPanel panel = new DrawPanel();

        //create a JFrame to hold the panel
        JFrame jframe = new JFrame();

        //add the panel to the frame
        jframe.add(panel);

        //set the frame's size
        jframe.setSize(350, 350);

        //set the frame to exit consloe when it is closed
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //set the frame to be visible
        jframe.setVisible(true);
    }
}
