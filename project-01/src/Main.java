import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Game2048 game = new Game2048();
        for (int row = 0; row < 4; ++row) {
            for (int col = 0; col < 4; col++) {
                int v = inp.nextInt();
                game.setAt(row, col, v);
            }
        }
        int userCmd = inp.nextInt();
        int i;
        switch (userCmd) {
            case 0:
                i = 0;
                game.moveLeft(i);
                break;
            case 1:
                i = 1;
                game.moveUp(i);
                break;
            case 2:
                i = 2;
                game.moveRight(i);
                break;
            case 3:
                i = 3;
                game.moveDown(i);
                break;
        }
        game.print();
    }
}