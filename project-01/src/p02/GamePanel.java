package p02;


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

        removeAll();
        init(xSize,ySize);
    }
    public void init (int xSize, int ySize){

        COLUMNS = ySize;
        ROWS = xSize;
        setLayout(new GridLayout(ROWS,COLUMNS));
        numbers = new NumberSquare[ROWS][COLUMNS];
        game.random();
        for (int row = 0; row < ROWS; row++){
            for (int col = 0; col < COLUMNS; col++){
                numbers[row][col] = new NumberSquare(game.getCoordinates(row,col));
                add(numbers[row][col]);
            }
        }
    }

    public void setValue(int x, int y, int v) {
        numbers[x][y] = new NumberSquare(v);
    }
    public NumberSquare getValue(int i, int j){
        return numbers[i][j];
    }


}
