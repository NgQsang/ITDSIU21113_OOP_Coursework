//class TestRectangle with a main method to instantiate 5 different rectangles and visualize them.
public class TestRectangle {
    public static void main(String[] args) {
        //instantiate 5 different rectangles
        Rectangle r1 = new Rectangle(15, 4);
        Rectangle r2 = new Rectangle(30, 10);
        Rectangle r3 = new Rectangle(50, 20);
        Rectangle r4 = new Rectangle(60, 40);
        Rectangle r5 = new Rectangle(-20, -10);

        //visualize them
        r1.visualize();
        System.out.println();
        r2.visualize();
        System.out.println();
        r3.visualize();
        System.out.println();
        r4.visualize();
        System.out.println();
        r5.visualize();
    }
}