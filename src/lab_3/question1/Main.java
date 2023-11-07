package question1;

// Using java.until.Scanner to get user input
import java.util.Scanner;

// Set the enum ShapeType
enum ShapeType {
    LINE, OVAL, RECTANGLE, DONE
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Set count to 0
        int count = 0;
        // Asker user to select 5 shapes and input their dimensions
        System.out.println("Pls select 5 shape: ");
        // Select the shape
        System.out.println("Shape" + (count + 1) + ": ");
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
     
        // Create a while loop within 5 shapes
        while (count < 5) {
            String shapeIn = input.nextLine();// Get the shape input
            ShapeType shape = ShapeType.valueOf(shapeIn);// Convert the shape input to enum

            // Create a switch statement to select the shape
            switch (shape) {
                case LINE:// lINE CASE
                    System.out.println("Length of Line is: ");
                    int length = input.nextInt();// Get the length of the line
                    input.nextLine();

                    // Create a MyLine object
                    MyLine line = new MyLine(length);
                    line.draw();// Draw the line
                    count++;// Increase the count
                    break; // Break the switch statement each time a shape is selected
                
                case OVAL:
                    System.out.println("Width of Oval is: ");
                    int width = input.nextInt();// Get the width of the oval
                    input.nextLine();
                    System.out.println("Height of Oval is: ");
                    int height = input.nextInt();// Get the height of the oval
                    input.nextLine();

                    // Create a MyOval object
                    MyOval oval = new MyOval(width, height);
                    oval.draw();// Draw the oval
                    System.out.println("This Oval has area: " + oval.GetArea());// Print the area of the oval
                    count++;// Increase the count
                    break; // Break the switch statement each time a shape is selected

                case RECTANGLE:
                    System.out.println("Width of Rectangle is: ");
                    width = input.nextInt();// Get the width of the rectangle
                    input.nextLine();
                    System.out.println("Height of Rectangle is: ");
                    height = input.nextInt();// Get the height of the rectangle
                    input.nextLine();

                    // Create a MyRectangle object
                    MyRectangle rectangle = new MyRectangle(width, height);
                    rectangle.draw();// Draw the rectangle
                    System.out.println("This Rectangle has area: " + rectangle.GetArea());// Print the area of the rectangle
                    count++;// Increase the count
                    break; // Break the switch statement each time a shape is selected
                    
                default:
                    System.out.println("Ivalid input"); //Error message
                    break;
            }           
        }
            input.close();// Close the Scanner object
        }
    }
