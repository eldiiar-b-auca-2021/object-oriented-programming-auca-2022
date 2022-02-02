public class Main {

    static final int UP = 0;
    static final int RIGHT = 1;
    static final int DOWN = 2;
    static final int LEFT = 3;
    static final int SCREEN_HEIGHT = 20;
    static final int SCREEN_WIDTH = 20;
    static char[][] screen = new char[SCREEN_HEIGHT][SCREEN_WIDTH];

    static int turtleRow;
    static int turtleCol;
    static int turtleDir;
    static boolean turtleIsPenDown;

    public static void main(String[] args) {

        initScreen();
        initTurtle();

        turtlePenDown();
        turtleMove(10);
        turtleTurnRight();
        turtleMove(10);
        turtleTurnLeft();
        turtleMove(7);
        turtleTurnLeft();
        turtleMove(5);
        turtleTurnRight();
        turtleMove(2);
        printScreen();


    }

    private static void turtlePenUp() {
        turtleIsPenDown = false;
    }

    private static void turtleTurnLeft() {
        turtleDir = turtleDir == UP ? LEFT : turtleDir-1;
    }

    private static void turtleTurnRight() {
        turtleDir = turtleDir == LEFT ? UP : turtleDir+1;
    }

    private static void turtleMove(int numSteps) {
        for (int i = 0; i < numSteps; i++) {
            switch (turtleDir) {
                case UP:
                    turtleRow--;
                    break;
                case RIGHT:
                    turtleCol++;
                    break;
                case DOWN:
                    turtleRow++;
                    break;
                case LEFT:
                    turtleCol--;
                    break;
            }
            if (turtleIsPenDown) {
                screen[turtleRow][turtleCol] = '*';
            }
        }
    }

    private static void turtlePenDown() {
        turtleIsPenDown = true;
        screen[turtleRow][turtleCol] = '*';
    }

    private static void initTurtle() {
        turtleRow = 0;
        turtleCol = 0;
        turtleDir = RIGHT;
    }


    private static void initScreen() {
        for (int i = 0; i < screen.length; i++) {
            for (int j = 0; j < screen[i].length; j++) {
                screen[i][j] = '.';
            }
        }
    }

    private static void printScreen() {
        for (int i = 0; i < screen.length; i++) {
            System.out.println();
            for (int j = 0; j < screen.length; j++) {
                System.out.print(screen[i][j]);
            }
        }
    }
}
