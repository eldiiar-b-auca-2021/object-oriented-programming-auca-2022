import java.util.Scanner;

public class Main {

    static final int SCREEN_HEIGHT = 20;
    static final int SCREEN_WIDTH = 20;
    static final int numberOfLine = 0;

    private static Scanner inp = new Scanner(System.in);
    public static void main(String[] args) {

        try {
            run();
        } catch (RuntimeException e) {
            System.out.println("Problem in line: "+numberOfLine+":");
            System.out.println(e.getMessage());
        }



    }
    public static void run (){
        Screen screen = new Screen(SCREEN_WIDTH, SCREEN_HEIGHT); //constructor
        Turtle turtle = new Turtle(screen, 0, 0, Turtle.RIGHT, false);
        UserCommand userCommand = new UserCommand(inp.nextLine());
        while (!userCommand.getName().equals("Exit")) {
            switch (userCommand.getName()) {
                case "Print":
                    screen.print();
                    break;
                case "PenUp":
                    turtle.turtlePenUp();
                    break;
                case "PenDown":
                    turtle.turtlePenDown();
                    break;
                case "TurnLeft":
                    turtle.turtleTurnLeft();
                    break;
                case "TurnRight":
                    turtle.turtleTurnRight();
                    break;
                case "Move":
                    turtle.turtleMove(userCommand.getNumberOfSteps());
                    break;
            }
           userCommand = new UserCommand(inp.nextLine());
        }
    }
}
