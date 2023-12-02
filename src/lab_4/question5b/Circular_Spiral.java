package question5b;

//import java.awt.Graphics;
//import javax.swing.JPanel;
//import java.awt.Color;

import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Color;

public class Circular_Spiral extends JPanel {
    //draws a circular shape that continualy spirals outwards
    public void paintComponent(Graphics g) {
        //call paintComponent to ensure the panel displays correctly
        super.paintComponent(g);

        //draw the spiral
        //with black color
        g.setColor(Color.BLACK);//set the color to black

        //x,y coordinates of upper left corner bounding rectangle
        int x = getWidth() / 2;
        int y = getHeight() / 2;

        //distance of radius changes
        int radiusStep = 20;
        
        //diameter of arc;
        int diameter = 0;

        //amount and direction of arc to sweep
        int arc = 180;

        //draw individual arc to form the spiral
        for(int i = 0; i <20; i++){
            if(i % 2 == 1)//increment diameter every second arc
                x -= 2 * radiusStep;

            y -= radiusStep;//decrement y coordinate
            //increment diameter
            diameter += 2 * radiusStep;

            //draw the arc
            g.drawArc(x, y, diameter, diameter, 0, arc);
            //reverse the direction of the arc
            arc = -arc;
        }
    }
}