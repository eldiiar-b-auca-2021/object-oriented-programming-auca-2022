import java.util.Scanner;

public class MainConsole {
    public static void main(String[] args) {
        Game2048 game2048 = new Game2048();
        int goal = 0;
        if (args.length > 1) {
            System.out.println("Too many arguments");
            System.exit(1);
        } else if (args.length == 0) {
            goal = 16;
        }
        try {
            goal = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Incorrect goal: " + args[0]);
            System.exit(1);
        }
        try {
            game2048 = new Game2048(goal);
            System.out.println("Goal: " + game2048.getGoal());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        Scanner inp = new Scanner(System.in);

        game2048.init();
        game2048.print();
        while (true) {
            String cmd = inp.nextLine();
            switch (cmd) {
                case "left":
                    game2048.moveLeft();
                    break;
                case "right":
                    game2048.moveRight();
                    break;
                case "up":
                    game2048.moveUp();
                    break;
                case "down":
                    game2048.moveDown();
                    break;
                case "exit":
                    System.exit(1);
                    break;
                default:
                    System.out.println("Incorrect command");
                    game2048.print();
                    continue;
            }
            System.out.println("Score: " + game2048.getScore());
            if (game2048.maxGoal()){
                System.out.println("You have reached the goal");
                break;
            }
            game2048.random();
            game2048.print();
        }
    }
}