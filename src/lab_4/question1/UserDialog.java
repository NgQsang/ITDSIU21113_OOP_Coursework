package question1;
//Using the JOptionPane dialog called input dialog
//to ask users to input the user's name
//and respond with a message dialog containing a greeting
//and the name that the user entered

//import the JOptionPane
import javax.swing.JOptionPane;

public class UserDialog {
    public static void main(String[]args){
        //prompt the user to enter their name
        String name = JOptionPane.showInputDialog("What is your name?");

        //create the message
        String message = String.format("Welcome, %s, to Java Programming!", name);

        //display the message to welcome the user
        JOptionPane.showMessageDialog(null, message);
    }
}
