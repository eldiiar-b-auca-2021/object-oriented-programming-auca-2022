import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    private int COLUMNS;
    private int ROWS;
    NumberSquare[][] numbers;
    int x;
    int y;
    Game2048 game = new Game2048();
    GamePanel(int xSize, int ySize){
        init(xSize,ySize);
    }
    public void init (int xSize, int ySize){
        removeAll();
        COLUMNS = xSize;
        ROWS = ySize;
        setLayout(new GridLayout(ROWS,COLUMNS));
        numbers = new NumberSquare[COLUMNS][ROWS];
        for (int row = 0; row < ROWS; row++){
            for (int col = 0; col < COLUMNS; col++){
                numbers[col][row] = new NumberSquare(game.getCoordinates(row,col));
                add(numbers[col][row]);
            }
        }
    }

    public void setValue(int x, int y, int v) {
        numbers[x][y] = new NumberSquare(v);
        add(numbers[x][y]);
    }
    public NumberSquare getValue(int i, int j){
        return numbers[i][j];
    }


}
