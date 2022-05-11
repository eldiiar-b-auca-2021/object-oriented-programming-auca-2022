package prototype05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Main extends JFrame {
    CanvasPanel mainPanel;
    JPanel controlPanel;
    JButton circleButton;
    JButton rectButton;
    JButton crossButton;

    ArrayList<Figure> figures = new ArrayList<>();
    Figure selectedFigure = null;
    Main()

    {
        mainPanel = new CanvasPanel();
        mainPanel.setBackground(Color.WHITE);
        add(mainPanel, BorderLayout.CENTER);

        controlPanel = new JPanel();
        controlPanel.setBackground(Color.GRAY);
        add(controlPanel, BorderLayout.SOUTH);

        rectButton = new JButton("Rectangle");
        circleButton = new JButton("Circle");
        crossButton = new JButton("Cross");

        controlPanel.setLayout(new GridLayout(1, 3));
        controlPanel.add(rectButton);
        controlPanel.add(circleButton);
        controlPanel.add(crossButton);

        rectButton.addActionListener(e -> {
            figures.add(new Rect(0, 0, 100, 100));
            repaint();
        });
        circleButton.addActionListener(e -> {
            figures.add(new Circle(150, 50, 50));
            repaint();
        });
        crossButton.addActionListener(e -> {
            figures.add(new Cross(250, 50, 100, 10));
            repaint();
        });
        mainPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (e.getButton() == MouseEvent.BUTTON3) {
                    for (Figure f : figures) {
                        if (f.contains(e.getX(), e.getY())) {
                            JOptionPane.showMessageDialog(null, f);
                        }
                    }
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                if(selectedFigure != null) {
                    selectedFigure.setSelected(false);
                    selectedFigure = null;
                }
                for (Figure f : figures) {
                    if (f.contains(e.getX(), e.getY())){
                        selectedFigure = f;
                        selectedFigure.setSelected(true);
                        break;
                    }

                }
            }

        });
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

            for (Figure f : figures) {
                f.draw(g);
            }
        }
    }
}
