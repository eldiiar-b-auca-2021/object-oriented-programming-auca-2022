import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Board extends JFrame {
    private final BufferedImage image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
    CanvasPanel mainPanel;
    Game2048 game = new Game2048();
    Board(){
        //setLayout(new GridLayout());
        setFocusable(true);

        mainPanel = new CanvasPanel();
        mainPanel.setFocusable(true);
        mainPanel.requestFocus();
        //mainPanel.add()
        add(mainPanel);
    }

    public static void main(String[] args) {
        Board frame = new Board();
        frame.setSize(1000,1000);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public class CanvasPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D gr = (Graphics2D) g;
            Font font = new Font("Verdana", Font.BOLD, 50);
            g.setFont(font);
            int initialX = (int) Math.round(getWidth()/8.0);
            int initialY = (int) Math.round(getWidth()/8.0);
            int x = (int) Math.round(getWidth()/8.0);
            int y = (int) Math.round(getHeight()/8.0);
            for (int i = 1; i <= 4; i++){
                for (int j = 1; j <= 4; j++){
                    if (i % 2 == 0){
                        if (j % 2 == 0) {
                            g.setColor(Color.WHITE);
                        }else {
                            g.setColor(Color.BLACK);
                        }
                    }else {
                        if (j % 2 != 0) {
                            g.setColor(Color.WHITE);
                        }else {
                            g.setColor(Color.BLACK);
                        }
                    }
                    g.fillRect(j*initialX,i*initialY,x,y);
                    gr.drawString("String", j*initialX,i*initialY);

                }
            }
            //g.fillRect(initialX,initialY,x,y);
        }
    }
}