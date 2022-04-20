package p08;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    CanvasPanel mainPanel;


    Main() {
        mainPanel = new CanvasPanel();
        mainPanel.setBackground(Color.GRAY);
//        mainPanel.paintComponents();
        add(mainPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        Main frame = new Main();
        frame.setTitle("Chessboard");
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    class CanvasPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            int cellWidth = (int) Math.round(getWidth()/8.0);
            int cellHeight = (int) Math.round(getHeight()/8.0);
            for (int r = 0; r < 8; r++){
            for (int c = 0; c < 8; c++) {
                if (c % 2 == 0 && r % 2 == 0 || r % 2 != 0 && c % 2 != 0) {
                    g.setColor(Color.WHITE);
                }else {
                    g.setColor(Color.BLACK);
                }
                g.fillRect(c * cellWidth, r*cellHeight, cellWidth, cellHeight);
            }
            }
        }
    }
}
