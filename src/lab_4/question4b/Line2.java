package question4b;

//import java.awt.Graphics;
//import javax.swing.JPanel;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Line2 extends JPanel {
    public void paintComponent(Graphics g) {
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

        //draw lines
        while(i < increments) {
            //left to bottom
            g.drawLine(0, i * heightStep,(i+1) * widthStep, height);

            //right to top
            g.drawLine(width, i * heightStep, width - (i+1) * widthStep, height);

            //right to bottom
            g.drawLine(width, height - i * heightStep, width - (i+1) * widthStep, 0);

            //left to top
            g.drawLine(0, height - i * heightStep, (i+1) * widthStep, 0);

            //increment the loop counter
            i++;
        }
    }
}
