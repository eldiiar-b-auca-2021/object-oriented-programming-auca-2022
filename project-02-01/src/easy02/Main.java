package easy02;

import javax.imageio.IIOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main extends JFrame {
    Model game = new Model();
    CanvasPanel gamePanel;
    BufferedImage robot;
    BufferedImage wall;
    BufferedImage ground;
    BufferedImage goal;
    BufferedImage boxRed;
    BufferedImage boxBlue;
    Main() throws IOException {
        robot = ImageIO.read(new File("images/images/Robot.png"));
        ground = ImageIO.read(new File("images/images/Ground.png"));
        wall = ImageIO.read(new File("images/images/Wall.png"));
        goal = ImageIO.read(new File("images/images/Goal.png"));
        boxRed = ImageIO.read(new File("images/images/BoxRed.png"));
        boxBlue = ImageIO.read(new File("images/images/BoxBlue.png"));

        gamePanel = new CanvasPanel();
        gamePanel.setBackground(Color.BLACK);
        gamePanel.setFocusable(true);
        gamePanel.requestFocus();
        gamePanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode() == KeyEvent.VK_LEFT){
                    game.moveLeft();
                }else if (e.getKeyCode() == KeyEvent.VK_RIGHT){
                    game.moveRight();
                }else if (e.getKeyCode() == KeyEvent.VK_DOWN){
                    game.moveDown();
                }else if (e.getKeyCode() == KeyEvent.VK_UP){
                    game.moveUp();
                }
                if (game.checkForWin()){
                    JOptionPane.showMessageDialog(null, "You Solved this level: "+game.getCurrentLevel());
                    game.reset();
                    game.nextLevel();
                    repaint();
                }
                repaint();
            }
        });
        add(gamePanel);
    }

    public static void main(String[] args) {
        try {
            Main frame = new Main();
            frame.setSize(600,600);
            frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        }catch (IOException e){
            JOptionPane.showMessageDialog(null,"Something wrong with game");
        }
    }

    class CanvasPanel extends JPanel {
        private void drawGroundImage(Graphics g, int r, int c) {
            int cellWidth = ground.getWidth();
            int cellHeight = ground.getHeight();
            int topLeftX = getWidth() / 2 - cellWidth * game.getCellWidth() / 2;
            int topLeftY = getHeight() / 2 - cellHeight * game.getCellHeight() / 2;
            g.drawImage(ground,
                    topLeftX + c * cellWidth ,
                    topLeftY + r * cellHeight ,
                    null);
        }

        private void drawImage(Graphics g, BufferedImage image, int r, int c) {
            int cellWidth = ground.getWidth();
            int cellHeight = ground.getHeight();
            int topLeftX = getWidth() / 2 - cellWidth * game.getCellWidth() / 2;
            int topLeftY = getHeight() / 2 - cellHeight * game.getCellHeight() / 2;
            g.drawImage(image,
                    topLeftX + c * cellWidth + cellWidth / 2 - image.getWidth() / 2,
                    topLeftY + r * cellHeight + cellHeight / 2 - image.getHeight() / 2,
                    null);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            for (int r = 0; r < game.getCellHeight(); r++) {
                for (int c = 0; c < game.getCellWidth(); c++) {
                    switch (game.elementAt(r, c)) {
                        case ' ':
                            drawGroundImage(g, r, c);
                            break;
                        case '#':
                            drawGroundImage(g, r, c);
                            drawImage(g, wall, r, c);
                            break;
                        case '.':
                            drawGroundImage(g, r, c);
                            drawImage(g, goal, r, c);
                            break;
                        case '$':
                            drawGroundImage(g,r,c);
                            drawImage(g,boxBlue,r,c);
                    }
                }
            }
            drawGroundImage(g, game.getRobotRow(), game.getRobotCol());
            drawImage(g, robot, game.getRobotRow(), game.getRobotCol());
        }
    }
}
