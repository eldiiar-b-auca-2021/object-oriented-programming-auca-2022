import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    private int COLUMNS;
    private int ROWS;
    NumberSquare[][] numbers;

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
                numbers[col][row] = new NumberSquare();
                add(numbers[col][row]);
            }
        }
    }

}
