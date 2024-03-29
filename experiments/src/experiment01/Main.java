package experiment01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Main extends JFrame {
    JPanel mainPanel;
    Game2048 game;
    Board board;
    JPanel gameTitle;
    Main(){
        gameTitle = new GameTitle();
        mainPanel = new CanvasPanel();
        mainPanel.setLayout(new GridBagLayout());
        game = new Game2048();
        board = new Board();
        mainPanel.add(gameTitle);
        mainPanel.add(board);

        add(mainPanel);
        board.setFocusable(true);
        board.requestFocus();
        mainPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode() == KeyEvent.VK_UP){
                    game.moveUp();
                    game.random();
                    update();
                }else if (e.getKeyCode() == KeyEvent.VK_DOWN){
                    game.moveDown();
                }else if (e.getKeyCode() == KeyEvent.VK_LEFT){
                    game.moveLeft();
                }else if (e.getKeyCode() == KeyEvent.VK_RIGHT){
                    update();
                    update();
                    game.moveRight();
                }
                repaint();
            }
        });


    }

    public static void main(String[] args) {
        Main frame = new Main();
        frame.setTitle("Game2048");
        frame.setBackground(Color.BLACK);
        //frame.setSize(800,800);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    class CanvasPanel extends JPanel{

        CanvasPanel(){
            setPreferredSize(new Dimension(getWidth(),getHeight()));
        }
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.BLACK);
            g.fillRect(0,0,getWidth(),getHeight());
        }
    }
    public void update(){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                board.setValue(i,j,game.getCoordinates(i,j));
            }
        }

    }

    private class GameTitle extends JPanel {
        Font FONT = new Font("Consolas", Font.PLAIN, 50);
        GameTitle(){
            setFont(FONT);
            setPreferredSize(new Dimension(400,400));
            setBackground(Color.BLACK);
        }
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.YELLOW);
            g.drawString("Game2048", 0,200);
        }
    }
}
