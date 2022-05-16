package experiment01;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    JPanel mainPanel;
    JPanel board;

    Game2048 game;
    Tile tile;
    Main(){
        setLayout(new BorderLayout());
        tile = new Tile();
        mainPanel = new JPanel();
        mainPanel.setBackground(Color.BLACK);
        board = new JPanel();
        board.setBackground(Color.GRAY);
        mainPanel.add(board, BorderLayout.CENTER);
        board.setLayout(new BorderLayout());
        board.add(tile, BorderLayout.SOUTH);
        mainPanel.add(board, BorderLayout.SOUTH);

        add(mainPanel);
    }

    public static void main(String[] args) {
        Main frame = new Main();
        frame.setTitle("Game2048");
        //frame.setSize(800,800);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    class Tile extends JComponent{
        Font FONT = new Font("Consolas", Font.PLAIN, 100);

        Tile (){
            setFont(FONT);
            setPreferredSize(new Dimension(600,600));
        }
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            int initialX = 10;
            int initialY = 10;
            int x = getWidth()/8;
            int y = getHeight()/8;
            for (int i = 1; i <= 4; i++){
                for (int j = 1; j <= 4; j++){
                    g.setColor(Color.DARK_GRAY);
                    g.fillRoundRect(j*x,y*i,x,y,50,50);
                    g.setColor(Color.RED);
                    String s = Integer.toString(0);
                    g.drawString(s, j*x+20,y*i+20);
                    g.setColor(Color.DARK_GRAY);
                }
            }

        }
    }

}
