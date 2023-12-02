package question6;

//import java.awt.Graphics;
//import java.awt.Color;
//The * after javax.swing means that all classes 
//within the javax.swing package are imported
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Color;

public class BarChart extends JPanel {
    public int[] numbers = new int[5];//array to hold the 5 numbers
    public String[] numberS = new String[5];//array to hold the 5 numbers as strings
    public Color[] colors = {Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW, Color.ORANGE};//array to hold the 5 colors

    public void paintComponent(Graphics g) {
        //call paintComponent to ensure the panel displays correctly
        super.paintComponent(g);

        int y = 20;//y coordinate of the bar

        //drawing here
        for(int i = 0; i < numbers.length; i++){
            //draw the bar
            g.setColor(colors[i]);//set the color
            g.fillRect(15, y, numbers[i], 20);//draw the bar

            //draw the label
            g.setColor(Color.BLACK);//set the color to black
            g.drawString(numberS[i], 0, y + 15);//draw the label
            y += 30;//increment y coordinate
        }
    }
    
}
