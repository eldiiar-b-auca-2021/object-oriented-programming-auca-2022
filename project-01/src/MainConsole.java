//import java.util.Scanner;
//public class MainConsole {
//    static Game2048 game;
//
//    public static void main(String[] args) {
//        int goal = 0;
//        if (args.length > 1) {
//            System.out.println("Too many arguments");
//            System.exit(1);
//        } else if (args.length == 0) {
//            goal = 16;
//        }
//        try {
//            goal = Integer.parseInt(args[0]);
//        } catch (NumberFormatException e) {
//            System.out.println("Incorrect maximum: " + args[0]);
//            System.exit(1);
//        }
//
//        try {
//            game = new Game2048(goal);
//            System.out.println("Goal: " + game.getGoal());
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }
//        Scanner inp = new Scanner(System.in);
//        try{
//            for (int row = 0; row < 4; ++row) {
//                for (int col = 0; col < 4; col++) {
//                    int v = inp.nextInt();
//                    game.setAt(row, col, v);
//                }
//            }
//        }catch (NumberFormatException e){
//            System.out.println("wrong numbers");
//        }
//        while (true) {
//            String cmd = inp.nextLine();
//            switch (cmd) {
//                case "left":
//                    game.moveLeft();
//                    break;
//                case "right":
//                    game.moveRight();
//                    break;
//                case "up":
//                    game.moveUp();
//                    break;
//                case "down":
//                    game.moveDown();
//                    break;
//                case "exit":
//                    // it does not work
//                    System.exit(1);
//                    break;
//            }
//            // it does not print
//            game.print();
//        }
//    }
//}