package question2;

//using class Graphics and class Panel to draw
import java.awt.Graphics;
import javax.swing.JPanel;

//because we are using the method from JPanel, we need to extend JPanel
public class DrawPanel extends JPanel {
    //paintComponent method is used to draw graphics
    public void paintComponent(Graphics g){
        //call the paintComponent to make sure the panel displays correctly
        super.paintComponent(g);

        //setting the width and height of the panel
        int width = getWidth();
        int height = getHeight();

        //draw a line from the upper-left to the lower-right
        g.drawLine(0, 0, width, height);

        //draw a line from the lower-left to the upper-right
        g.drawLine(0, height, width, 0);

        //draw a line from the middle of the left side to the middle of the right side
        g.drawLine(width/2, 0, width/2, height);
        g.drawLine(0, height/2, width, height/2);
    }
}
