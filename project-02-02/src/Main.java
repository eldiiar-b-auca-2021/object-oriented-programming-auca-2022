import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main extends JFrame {
    Model model;

    CanvasPanel gamePanel;
    JPanel controlPanel;
    BufferedImage human;
    BufferedImage blueBox;
    BufferedImage goal;
    BufferedImage humanTurnRight;
    BufferedImage humanTurnLeft;
    BufferedImage humanTurnBack;
    BufferedImage wall;
    BufferedImage ground;
    BufferedImage redBox;
    Main() throws IOException {
        File file = new File("images/");
        Scanner in = new Scanner(file);
        setLayout(new BorderLayout());
        model = new Model();
        human = ImageIO.read(new File("images/images/Robot.png"));
        humanTurnBack = ImageIO.read(new File("images/images/RobotU.png"));
        humanTurnLeft = ImageIO.read(new File("images/images/RobotL.png"));
        humanTurnRight = ImageIO.read(new File("images/images/RobotR.png"));
        goal = ImageIO.read(new File("images/images/Goal.png"));
        wall = ImageIO.read(new File("images/images/Wall.png"));
        ground = ImageIO.read(new File("images/images/Ground.png"));
        blueBox = ImageIO.read(new File("images/images/BoxBlue.png"));
        redBox = ImageIO.read(new File("images/images/BoxRed.png"));

        add(gamePanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        try {
            Main frame = new Main();
            frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.setSize(600, 600);
            frame.setVisible(true);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "something wrong with the game");
        }
    }

    private class CanvasPanel extends JPanel{
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

        }
    }
}
