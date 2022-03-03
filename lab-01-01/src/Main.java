import java.util.*;

public class Main {
    static final int SCREEN_WIDTH = 20;
    static final int SCREEN_HEIGHT = 20;
    static final int UP = 0;
    static final int RIGHT = 1;
    static final int DOWN = 2;
    static final int LEFT = 3;

    //screen
    static char[][] screen = new char[SCREEN_HEIGHT][SCREEN_WIDTH];

    //turtle
    static int turtleCol;
    static int turtleRow;
    static int turtleDir;
    static boolean turtlePenIsDown;

    //userCommand
    static String userCommandName;
    static int userCommandNumberOfSteps;

    //standard input
    static Scanner inp = new Scanner(System.in);
    static int numberOfLine = 0;


    public static void main(String[] args) {
        try {
            run();
        } catch (RuntimeException e) {
            System.out.println("Problem in line: " + numberOfLine + ":");
            System.out.println(e.getMessage());
        }
    }

    private static void run() {
        initScreen();
        initTurtle();
        initUserCommand();

        readUserCommand();
        while (!userCommandName.equals("exit")) {
            switch (userCommandName) {
                case "Print":
                    printScreen();
                    break;
                case "PenUp":
                    turtlePenUP();
                    break;
                case "PenDown":
                    turtlePenDown();
                    break;
                case "TurnLeft":
                    turtleTurnLeft();
                    break;
                case "TurnRight":
                    turtleTurnRight();
                    break;
                case "Move":
                    turtleMove(userCommandNumberOfSteps);
                    break;
            }
            readUserCommand();
        }
    }

    private static void readUserCommand() {
        String line = inp.nextLine().trim();
        ++numberOfLine;
        switch (line) {
            case "Print":
            case "PenUp":
            case "PenDown":
            case "TurnLeft":
            case "TurnRight":
            case "Exit":
                userCommandName = line;
                userCommandNumberOfSteps = 0;
                return;
        }

        Scanner lineInp = new Scanner(line);
        String name = lineInp.next();
        if (!name.equals("Move")) {
            throw new RuntimeException("Incorrect command '" + line + "'");
        }
        if (!lineInp.hasNextInt()) {
            throw new RuntimeException("Incorrect number of steps in command: '" + line + "'");
        }

        int numberOfSteps = lineInp.nextInt();
        if (numberOfSteps < 0) {
            throw new RuntimeException("Negative number of steps in command: '" + line + "'");
        }
        if (lineInp.hasNext()) {
            throw new RuntimeException("Too many arguments in command: '" + line + "'");
        }
        userCommandName = name;
        userCommandNumberOfSteps = numberOfSteps;
    }

    static void initUserCommand() {
        userCommandName = "";
        userCommandNumberOfSteps = 0;
    }

    private static void turtleTurnLeft() {
        turtleDir = turtleDir == UP ? LEFT : turtleDir - 1;
    }

    private static void turtleTurnRight() {
        turtleDir = turtleDir == LEFT ? UP : turtleDir + 1;
    }

    private static void turtleMove(int numOfSteps) {
        for (int i = 0; i < numOfSteps; ++i) {
            switch (turtleDir) {
                case UP:
                    --turtleCol;
                    break;
                case RIGHT:
                    ++turtleRow;
                    break;
                case DOWN:
                    ++turtleCol;
                    break;
                case LEFT:
                    --turtleRow;
                    break;
            }
            if (isOffTheScreen()) {
                throw new RuntimeException("Turtle is off the screen " + turtleRow + ", " + turtleCol);
            }
            if (turtlePenIsDown) {
                screen[turtleCol][turtleRow] = '*';
            }
        }
    }

    private static boolean isOffTheScreen() {
        return turtleRow < 0 || SCREEN_HEIGHT <= turtleRow || turtleCol < 0 || SCREEN_WIDTH <= turtleCol;
    }

    private static void turtlePenUP() {
        turtlePenIsDown = false;
    }

    private static void turtlePenDown() {
        turtlePenIsDown = true;
        screen[turtleRow][turtleCol] = '*';
    }

    private static void initTurtle() {
        turtleRow = 0;
        turtleCol = 0;
        turtleDir = RIGHT;
      //  turtlePenIsDown = false;
    }

    private static void printScreen() {
        for (int row = 0; row < SCREEN_HEIGHT; ++row) {
            //print current column
            for (int col = 0; col < SCREEN_WIDTH; ++col) {
                System.out.print(screen[row][col]);
            }
            //go to the next line
            System.out.println();
        }
    }

    static void initScreen() {
        for (int row = 0; row < SCREEN_HEIGHT; ++row) {
            for (int col = 0; col < SCREEN_WIDTH; ++col) {
                screen[row][col] = '.';
            }
        }
    }
}