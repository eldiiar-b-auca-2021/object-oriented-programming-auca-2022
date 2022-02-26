public class Turtle {
    private Screen screen;;
    private int row;
    private int col;
    private int dir;
    private boolean isPenDown;
    public static final int UP = 0;
    public static final int RIGHT = 1;
    public static final int DOWN = 2;
    public static final int LEFT = 3;

    public Turtle (Screen aScreen,int aRow, int aCol, int aDir, boolean penDown) {
        screen = aScreen;
        row = aRow;
        col = aCol;
        dir = aDir;
        isPenDown = penDown;
    }
    public void turtleTurnLeft() {
        dir = dir == UP ? LEFT : dir-1;
    }

    public void turtleTurnRight() {
        dir = dir == LEFT ? UP : dir+1;
    }
    public void turtleMove(int numSteps) {
        for (int i = 0; i < numSteps; i++) {
            switch (dir) {
                case UP:
                    row--;
                    break;
                case RIGHT:
                    col++;
                    break;
                case DOWN:
                    row++;
                    break;
                case LEFT:
                    col--;
                    break;
            }
            if (isTurtleOfScreen()) {
                throw new RuntimeException("Turtle is off the screen " + row + col);
            }
            if (isPenDown) {
                screen.drawAt(row,col);
            }
        }
    }
    private boolean isTurtleOfScreen() {
        return row < 0 || screen.getHeight() <= row || col < 0 || screen.getWidth() <= col;
    }
    public void turtlePenUp() {

        isPenDown = false;
    }

    public void turtlePenDown() {
        isPenDown = true;
        screen.drawAt(row,col);
    }

}
