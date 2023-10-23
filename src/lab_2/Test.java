public class Test {
    static void visualizing() {
        //---------------Upper barrier---------------
        for (int i = -1; i <= Box.WIDTH + 1; i++) {
            System.out.print("- ");
        }
        System.out.println();
        /* Boundaries between upper and lower barrier */
        for (int i = 0; i <= Box.HEIGHT; i++) {
            for (int j = -1; j <= Box.WIDTH + 1; j++) {
                // Left and right Barriers !
                if (j == -1 || j == Box.WIDTH + 1) {
                    System.out.print("| ");
                    continue;
                }
                // Position of the particles !
                if (Box.positionMatrix[i][j] > 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        //---------------Lower barrier---------------
        for (int i = -1; i <= Box.WIDTH + 1; i++) {
            System.out.print("- ");
        }
        System.out.println();
    }

    //showMatrix() method
    static void showMatrix() {
        for (int i = 0; i <= Box.HEIGHT; i++) {
            for (int j = 0; j <= Box.WIDTH; j++) {
                System.out.print(Box.positionMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    //main() method
    public static void main(String[] args) throws InstantiationException {
        Box box = Box.createBox(4, 4, 3); // Width=2, Height=2, NumParticles=3
        System.out.println("*STEP 0");
        System.out.println("Number of particles = " + Box.getNumParticles());
        showMatrix();
        visualizing();

        // Run 5 steps
        for (int i = 1; i <= 5; i++) {
            System.out.println("*STEP " + i);
            for (int[] coordinate : Box.allParticlesMove()) {
                System.out.println(
                        String.format(
                                "Collision at [x, y] = [%d, %d] ",
                                coordinate[0],
                                coordinate[1]
                        )
                );
            }
            System.out.println("Number of particles = " + Box.getNumParticles());
            showMatrix();
            visualizing();
        }
    }
}