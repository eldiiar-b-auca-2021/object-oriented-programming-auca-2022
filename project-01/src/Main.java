import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Game2048 game = new Game2048();
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++) {
                int value = in.nextInt();
                game.setAt(i,j,value);
            }
        }
        while (true){
            int command = in.nextInt();
            switch(command){
                case 0:
                    game.moveLeft();
                    break;
                case 1:
                    game.moveRight();
                    break;
                case 2:
                    game.moveUp();
                    break;
                case 3:
                    game.moveDown();
                    break;
            }
            game.display();
        }
    }
}
