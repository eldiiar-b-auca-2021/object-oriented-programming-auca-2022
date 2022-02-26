import java.util.Scanner;

public class UserCommand {
    private static String name;
    private int numberOfSteps;
    static Scanner inp = new Scanner(System.in);
    public UserCommand(String line) {
            line = inp.nextLine().trim();
            switch(line){
                case "Print":
                case "PenDown":
                case "PenUp":
                case "TurnLeft":
                case "TurnRight":
                case "Exit":
                    name = line;
                    numberOfSteps = 0;
                    return;
            }
            Scanner lineInp = new Scanner(line);
            name = lineInp.next();
            if (!name.equals("Moves")){
                throw new RuntimeException("Incorrect command: '"+line+"'");
            }
            if (!lineInp.hasNextInt()) {
                throw new RuntimeException("Incorrect number of steps: " + line + ":");
            }
            int numberOfSteps = lineInp.nextInt();
            if (numberOfSteps < 0) {
                throw new RuntimeException("Negative number of steps: " + line + ":");
            }
            if (lineInp.hasNext()) {
                throw new RuntimeException("Too many arguments in command: " + line + ":");
            }
        }

    public String getName() {
        return name;
    }

    public int getNumberOfSteps(){
        return numberOfSteps;
        }
    }

