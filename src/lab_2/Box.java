//import standard class in java.util package
import java.util.ArrayList;
import java.util.Arrays;//used to manipulate arrays.
import java.util.List;//represents an ordered collection.
import java.util.Collection;//generic interface representing a collection of objects.
import java.util.HashSet;//used to create a set to store particles in the box.

public class Box {
    //set up the box
    static int WIDTH;
    static int HEIGHT;
    private static Box BOX;//declares a static Box object named BOX./ Singleton pattern
    private static Collection<Particle> particles;//which is intended to store the particles in the box.
    static int[][] positionMatrix;//declares a static 2D array used to keep track of the positions of particles in the box.

    //constructor
    private Box(int width, int height, int numParticles) {
    //Private constructor to prevent the use of constructor by client apps!
        Box.WIDTH = width;//fixed size
        Box.HEIGHT = height;//fixed size
        positionMatrix = new int[height+1][width+1];//Range [0, height][0, width]
        particles = new HashSet<>();//intended to store the particles.

        //initialize particles
        //Hint: use a loop to create numParticles of particles
        //Hint: use addParticle() method to add particles to the Box
        for(int i = 0; i < numParticles; i++) {
            particles.add(new Particle());
        }
        Box.updatePositionMatrix();//update position matrix
    }

    //allParticlesmove() method
    public static List<int[]> allParticlesMove() {//returns a List of arrays of integers.
        for (Particle particle : particles) {//through each Particle object in the particles collection.
            particle.move();//to simulate the particle's movement.   
        }
        Box.updatePositionMatrix();//update position matrix
        return Box.getCollidingPosition();//returns a List of arrays of integers.
    }

    //addCollidingPosition() method
    public static List<int[]> getCollidingPosition() {
        List<int[]> collidingPosition = new ArrayList<>();//Creates a new ArrayList named collidePos to store collision positions.
        int numParticlesAdded = 0;//initializes the number of particles added to 0.
        //track the number of particles added as a result of collisions
        //outer loop: through each row
        for (int i = 0; i <= Box.HEIGHT; i++) {
            //inner loop: through each column
            for (int j = 0; j <= Box.WIDTH; j++) {
                if (Box.positionMatrix[i][j] <= 1) {//equals 1 it means there is 1 particle at the position
                    continue; //continue to next iteration because no collision
                }
                //number of particles after collision
                numParticlesAdded += Box.positionMatrix[i][j]-1;
                collidingPosition.add(new int[]{j, i});
            }
        }
        
        //adding new particles as a result of collisions.
        for (int i = 0; i < numParticlesAdded; i++) {
            particles.add(new Particle());//new Particle object and adds it to the particles collection.
        }
        Box.updatePositionMatrix();//update position matrix
        //positions where collisions occurred.
        return collidingPosition;
    }

    //updatePositionMatrix() method
    private static void updatePositionMatrix() {
        //reset position matrix
        for (int[] row: positionMatrix) {
            Arrays.fill(row, 0);//reset all values in position matrix to 0
        }

        //update position matrix
        for (Particle particle : particles) {
            positionMatrix[particle.getY()][particle.getX()]+=1;
        }
    }

    /**
     * Singleton pattern !
     *
     * @param width
     * @param height
     * @param numParticles
     * @return
     * @throws InstantiationException
     */
    //createBox() method
    public static Box createBox(int width, int height, int numParticles) throws InstantiationException {
        if (BOX == null) {
            BOX = new Box(width, height, numParticles);
            return BOX;
        }
        throw new InstantiationException("Box already exists!");
    }

    /**
     * Singleton pattern !
     *
     * @return
     * @throws NullPointerException
     */
    //getBox() method
    public static Box getBox() throws NullPointerException {
        if (BOX == null) {
            throw new NullPointerException("Box does not exist!");
        }
        return BOX;
    }

    //getNumParticle() method
    public static int getNumParticles() {
        return particles.size();
    }
}