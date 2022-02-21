import java.util.Scanner;

public class Main {

    static final int UP = 0;
    static final int RIGHT = 1;
    static final int DOWN = 2;
    static final int LEFT = 3;
    static final int SCREEN_HEIGHT = 20;
    static final int SCREEN_WIDTH = 20;
    static char[][] screen = new char[SCREEN_HEIGHT][SCREEN_WIDTH];

    static int numberOfLine = 0;
    static String userCommandName;
    static int userCommandNumberOfSteps;
    static int turtleRow;
    static int turtleCol;
    static int turtleDir;
    static boolean turtleIsPenDown;
    static Scanner inp = new Scanner(System.in);
    public static void main(String[] args) {

        try {
            run();
        } catch (RuntimeException e) {
            System.out.println("Problem in line: "+numberOfLine+":");
            System.out.println(e.getMessage());
        }

    }

    private static void run() {
        initScreen();
        initTurtle();
        initUserCommand();

        readUserCommand();
        while (!userCommandName.equals("Exit")) {
            switch (userCommandName) {
                case "Print":
                    printScreen();
                    break;
                case "PenUp":
                    turtlePenUp();
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
        numberOfLine++;
        switch(line){
            case "Print":
            case "PenDown":
            case "PenUp":
            case "TurnLeft":
            case "TurnRight":
            case "Exit":
                userCommandName = line;
                userCommandNumberOfSteps = 0;
                return;
        }
        Scanner lineInp = new Scanner(line);
        String name = lineInp.next();
        if (!name.equals("Moves")){
            throw new RuntimeException("Incorrect command: '"+line+"'");
        }
        if (!lineInp.hasNextInt()) {
            throw new RuntimeException("Incorrect number of steps: " + line + ":");
        }
        int numberOfSteps = lineInp.nextInt();
        if (userCommandNumberOfSteps < 0) {
            throw new RuntimeException("Negative number of steps: " + line + ":");
        }
        if (lineInp.hasNext()) {
            throw new RuntimeException("Too many arguments in command: " + line + ":");
        }
        userCommandName = name;
        userCommandNumberOfSteps = numberOfSteps;
    }

    private static void initUserCommand() {
        userCommandName = "";
        userCommandNumberOfSteps = 0;
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
            if (isTurtleOfScreen()) {
                throw new RuntimeException("Turtle is off the screen: " + turtleRow + ", " + turtleCol);
            }
            if (turtleIsPenDown) {
                screen[turtleRow][turtleCol] = '*';
            }
        }
    }

    private static boolean isTurtleOfScreen() {
        return turtleRow < 0 || SCREEN_HEIGHT <= turtleRow || turtleCol < 0 || SCREEN_WIDTH <= turtleCol;
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
