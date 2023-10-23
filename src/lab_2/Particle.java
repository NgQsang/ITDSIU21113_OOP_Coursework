//used for generating random numbers.
import java.util.Random;
import javax.swing.Box;

public class Particle {
    //instance variables
    //
    private int x;
    private int y;
    //next position.
    private int dx;
    private int dy;

    //Hint: declare an enum type for Direction
    private enum Direction {
        N, NE, E, SE, S, SW, W, NW
    }

    //marked as final because it won't change once initialized.
    private static final Direction[] DIRECTIONS = Direction.values();//creates an array DIRECTIONS that holds all the values of the Directions enumeration
    private static final Random RANDOM = new Random();//generate random numbers for particle movement

    //Particle() constructor
    public Particle() {
        this.x = RANDOM.nextInt(Box.WIDTH +1 ); // Range [0, Box.WIDTH]
        this.y = RANDOM.nextInt(Box.HEIGHT + 1);// Range [0, Box.HEIGHT]
    }

    //getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    //move() method
    public void move() {
        Direction direction = DIRECTIONS[RANDOM.nextInt(8)];//randomly select a direction
        switch (direction) {
            //North, Northeast, East, Southeast, South, Southwest, West, Northwest
            case N:
                dy = y - 1;
                break;
            case NE:
                dx = x + 1;
                dy = y - 1;
                break;
            case E:
                dx = x + 1;
                break;
            case SE:
                dx = x + 1;
                dy = y + 1;
                break;
            case S:
                dy = y + 1;
                break;
            case SW:
                dx = x - 1;
                dy = y + 1;
                break;
            case W:
                dx = x - 1;
                break;
            case NW:
                dx = x - 1;
                dy = y - 1;
                break;
            default:
                break;
        }
        if (dx <0 || dy < 0 || dx > Box.WIDTH || dy > Box.HEIGHT) {
            this.move();//Particle moves again if it is out of bounds.
        }
        this.x = dx;
        this.y = dy;
    }
}


