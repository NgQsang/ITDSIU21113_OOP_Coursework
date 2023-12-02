package question3a;

//import java.awt.Graphics;
//import javax.swing.JPanel;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Line1 extends JPanel {
    //draw lines that fan out from the corners and intersect along the center
    public void paintComponent(Graphics g){
        //call paintComponent to ensure the panel displays correctly
        super.paintComponent(g);

        //number of increments each side is divided 
        int increments = 15;

        //total width and height of the panel
        int width = getWidth();
        int height = getHeight();

        //width and height increments
        int widthStep = width / increments;
        int heightStep = height / increments;

        //loop counter
        int i = 0;

        while(i < increments) {
            //lines fanning out from the top left corner
            g.drawLine(0, 0, i * widthStep, height - i * heightStep);

            //increment the loop counter
            i++;
        }
    }
    
}