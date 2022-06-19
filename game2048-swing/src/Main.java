import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        var board = new Board();

        while(in.hasNextLine()){
            String command = in.nextLine().toLowerCase();
            switch(command){
                case "up": board.shiftUp(); break;
                case "down": board.shiftDown(); break;
                case "right": board.shiftRight(); break;
                case "left": board.shiftLeft(); break;

                default : continue;
            }
            board.present(board);
        }
    }
}
