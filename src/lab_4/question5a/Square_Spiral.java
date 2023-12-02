package question5a;

//import java.awt.Graphics;
//import javax.swing.JPanel;
//import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Color;

public class Square_Spiral extends JPanel {
    //draws a square shape that continualy spirals outwards
    public void paintComponent(Graphics g) {
        //call paintComponent to ensure the panel displays correctly
        super.paintComponent(g);

        //draw the spiral
        //with red color
        g.setColor(Color.RED);//set the color to red

        //starting point
        int oldX = getWidth() / 2;
        int oldY = getHeight() / 2;

        //initial distance
        int distance = 0;

        //draw individual line to form the spiral
        for(int i=0; i<20; i++) {
            //new starting point
            int newX = oldX;
            int newY = oldY;

            //increment distance every second line
            if(i % 2 == 0)
                distance += 40;//setting the distance between lines
            //setting the end point depending on the direction
            //down-left-up-right
            //using the switch statement
            switch (i % 4) {
                case 0:
                    newY += distance;
                    break;
                case 1:
                    newX -= distance;
                    break;
                case 2:
                    newY -= distance;
                    break;
                case 3:
                    newX += distance;
                    break;
            }
            //draw the line
            g.drawLine(oldX, oldY, newX, newY);
            //update the starting point
            oldX = newX;
            oldY = newY;
        }
    }
}