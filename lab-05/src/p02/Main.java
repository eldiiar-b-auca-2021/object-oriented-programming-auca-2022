package p02;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame{
    JPanel mainPanel;
    JPanel controlPanel;
    JButton redButton = new JButton("RED");
    JButton greenButton = new JButton("GREEN");
    JButton blueButton = new JButton("BLUE");

    Main() {
        mainPanel = new JPanel();
        mainPanel.setBackground(Color.RED);
        add(mainPanel, BorderLayout.CENTER);
        controlPanel = new JPanel();
        controlPanel.setBackground(Color.GRAY);
        controlPanel.add(redButton);
        controlPanel.add(greenButton);
        controlPanel.add(blueButton);
        add(controlPanel,BorderLayout.SOUTH);

        greenButton.addActionListener(new ButtonActionListener(this));

    }
    public static void main(String[] args) {
        Main frame = new Main();
        frame.setTitle("First Swing App");
        frame.setSize(600,600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}

class ButtonActionListener implements ActionListener{
    Main main;
    ButtonActionListener(Main main){
        this.main = main;
    }
    @Override
    public void actionPerformed(ActionEvent e){
        main.mainPanel.setBackground(Color.GREEN);
    }
}