package p03;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame {
    JPanel mainPanel;
    JPanel controlPanel;
    JButton redButton = new JButton("RED");
    JButton greenButton = new JButton("GREEN");
    JButton blueButton = new JButton("BLUE");

    Main() {
        setLayout(new BorderLayout());
        mainPanel = new JPanel();
        mainPanel.setBackground(Color.RED);
        add(mainPanel, BorderLayout.CENTER);
        controlPanel = new JPanel();
        controlPanel.setBackground(Color.GRAY);
        controlPanel.add(redButton);
        controlPanel.add(greenButton);
        controlPanel.add(blueButton);
        add(controlPanel, BorderLayout.SOUTH);

        redButton.addActionListener(new ButtonActionListener(/*this,*/ Color.RED));
        greenButton.addActionListener(new ButtonActionListener(/*this,*/ Color.GREEN));
        blueButton.addActionListener(new ButtonActionListener(/*this, */Color.BLUE));


    }

    public static void main(String[] args) {
        Main frame = new Main();
        frame.setTitle("First Swing App");
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    // inner class
    class ButtonActionListener implements ActionListener {
        //Main main;
        Color color;

        public ButtonActionListener(/*Main main,*/ Color color) {

            //this.main = main;
            this.color = color;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            /*main.*/
            mainPanel.setBackground(color);
        }
    }
}