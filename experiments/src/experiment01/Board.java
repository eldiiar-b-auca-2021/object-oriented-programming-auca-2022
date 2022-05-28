package experiment01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Board extends JPanel {
    Tile[][] tile;
    Game2048 game = new Game2048();

    Board(){
        removeAll();
        setPreferredSize(new Dimension(520,520));
        setBackground(Color.GRAY);
        setLayout(new GridLayout(4,4));
        drawBoard();

    }
    public void drawBoard(){
        //removeAll();
        tile = new Tile[4][4];
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                tile[i][j] = new Tile(game.getCoordinates(i,j));
                add(tile[i][j]);
            }
        }
    }
    public void setValue(int i, int j, int value){

        tile[i][j] = new Tile(value);
    }

}

