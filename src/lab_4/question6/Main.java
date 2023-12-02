package question6;

//import JFrames and JOptionPane(to create a dialog box)
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main {
    public static void Q6() {
        //create a JFrame
        JFrame frame = new JFrame();
        //create a BarChart object
        BarChart bar = new BarChart();

        //setting the for loop to 5
        for(int i = 1; i <= 5; i++){
            bar.numberS[i - 1] = JOptionPane.showInputDialog("Enter the length of bar " + i);
            bar.numbers[i - 1] = Integer.parseInt(bar.numberS[i - 1]);
        }
        frame.add(bar);//add the bar to the frame
        frame.setSize(550, 550);//set the size of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//set the default close operation
        frame.setVisible(true);//set the frame to visible
    }
    //main method
    public static void main(String[] args) {
        Q6();
    }
}
