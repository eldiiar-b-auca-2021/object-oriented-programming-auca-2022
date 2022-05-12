import java.util.Scanner;

public class Main {

    static Scanner inp = new Scanner(System.in);
    static Game2048 game2048 = new Game2048();

    public static void main(String[] args) {
        for (int row = 0; row < 4; ++row) {
            for (int col = 0; col < 4; col++) {
                int v = inp.nextInt();
                game2048.setAt(row, col, v);
            }
        }
        int move = inp.nextInt();
        switch (move) {
            case 0:
                game2048.moveLeft();
                break;
            case 1:
                game2048.moveUp();
                break;
            case 2:
                game2048.moveRight();
                break;
            case 3:
                game2048.moveDown();
                break;
        }
        game2048.print();
    }
}