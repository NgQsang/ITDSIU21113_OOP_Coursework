package question3b;

//import java.awt.Graphics;
//import javax.swing.JPanel;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Line2 extends JPanel {
    //draw lines that fan out from the corners and intersect along the center
    public void paintComponent(Graphics g){
        //call paintComponent to ensure the panel displays correctly
        super.paintComponent(g);

        //number of steps
        int steps = 15;

        //get the width and height of the panel
        int width = getWidth();
        int height = getHeight();

        //width and height increments
        int widthIncrement = width / steps;
        int heightIncrement = height / steps;

        //loop counter
        int i = 0;

        while(i < steps) {
            //lines fanning out from the top left corner
            g.drawLine(0, 0, i * widthIncrement, height - i * heightIncrement);

            //lines fanning out from the bottom right corner
            g.drawLine(width, height, i * widthIncrement, height - i * heightIncrement);

            //lines fanning out from the bottom left corner
            g.drawLine(0, height, i * widthIncrement, i * heightIncrement);

            //lines fanning out from the top right corner
            g.drawLine(width, 0, i * widthIncrement, i * heightIncrement);

            //increment the loop counter
            i++;
        }
    }
    
}
