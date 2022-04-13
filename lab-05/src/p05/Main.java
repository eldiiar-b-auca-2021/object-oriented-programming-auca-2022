package p05;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame{
    JPanel mainPanel;


    Main() {
        mainPanel = new JPanel();
        mainPanel.setBackground(Color.GRAY);
        add(mainPanel, BorderLayout.CENTER);
        mainPanel.addMouseMotionListener(new MainPanelMouseMotionListener());

    }
    public static void main(String[] args) {
        Main frame = new Main();
        frame.setTitle("Mouse coordinates");
        frame.setSize(600,600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
    class MainPanelMouseMotionListener implements MouseMotionListener{

        @Override
        public void mouseDragged(MouseEvent e) {
            // empty
        }

        @Override
        public void mouseMoved(MouseEvent e) {
           setTitle(e.getX()+", "+e.getY());
        }
    }
}
