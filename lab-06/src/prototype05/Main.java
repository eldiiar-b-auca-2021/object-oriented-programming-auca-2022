package prototype05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Main extends JFrame {
    CanvasPanel mainPanel;
    JPanel controlPanel;
    JButton circleButton;
    JButton rectButton;
    JButton crossButton;

    ArrayList<Figure> figures = new ArrayList<>();
    Figure selectedFigure = null;
    int selectedFigureX;
    int selectedFigureY;
    Main(){
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
            mainPanel.requestFocus();
        });
        circleButton.addActionListener(e -> {
            figures.add(new Circle(150, 50, 50));
            repaint();
            mainPanel.requestFocus();
        });
        crossButton.addActionListener(e -> {
            figures.add(new Cross(250, 50, 100, 10));
            repaint();
            mainPanel.requestFocus();
        });

        mainPanel.requestFocus();
        mainPanel.setFocusable(true);
        mainPanel.addMouseListener(new MyMouseAdapter());
        mainPanel.addKeyListener(new CanvasPanelKeyboardAdapter());
        mainPanel.addMouseMotionListener(new CanvasPanelMouseMotionListener());
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

    private class MyMouseAdapter extends MouseAdapter {
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
                    selectedFigureX = getX();
                    selectedFigureY = getY();
                    break;
                }

            }
            repaint();
        }

    }

    private class CanvasPanelKeyboardAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            super.keyPressed(e);
            if(selectedFigure != null){
                figures.remove(selectedFigure);
                selectedFigure = null;
                repaint();
            }
        }
    }

    private class CanvasPanelMouseMotionListener extends MouseMotionAdapter {
        @Override
        public void mouseDragged(MouseEvent e) {
            if (selectedFigure != null){
                selectedFigure.move(e.getX()-selectedFigureX,e.getY()-selectedFigureY);
                selectedFigureX = e.getX();
                selectedFigureY = e.getY();
                repaint();
            }
        }
    }
}
