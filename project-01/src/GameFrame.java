import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame{

    JPanel panelMain;
    JPanel panelGame;
    JButton btnLeft;
    JButton btnRight;
    JButton btnDown;
    JButton btnUp;
    JPanel panelButtons;
    NumberSquare numberSquare;
    GameFrame(){

        panelMain = new JPanel();
        panelMain.setBackground(Color.GREEN);
        BoxLayout layout = new BoxLayout(panelMain,BoxLayout.Y_AXIS);
        panelMain.setLayout(layout);

        panelGame = new JPanel();
        panelMain.add(panelGame);
        panelGame.setPreferredSize(new Dimension(400,400));
//        panelGame.setLayout(new GridLayout(4,4));
//        for (int i = 0; i < 16; i++){
//            panelGame.add(new NumberSquare(i));
//        }// here can be a mistake

        panelButtons = new JPanel();
        panelButtons.setBackground(Color.RED);
        panelButtons.setLayout(new GridBagLayout());

        GridBagConstraints contstraints = new GridBagConstraints();
        btnLeft = new JButton("Slide Left");
        contstraints.gridx = 0; contstraints.gridy = 1;
        panelButtons.add(btnLeft, contstraints);

        btnRight = new JButton("Slide Right");
        contstraints.gridx = 2; contstraints.gridy = 1;
        panelButtons.add(btnRight, contstraints);

        btnDown = new JButton("Slide Down");
        contstraints.gridx = 4; contstraints.gridy = 1;
        panelButtons.add(btnDown, contstraints);

        btnUp = new JButton("Slide Up");
        contstraints.gridx = 6; contstraints.gridy = 1;
        panelButtons.add(btnUp, contstraints);

        panelMain.add(panelButtons);
        add(panelMain);

    }
    public static void main(String[] args) {
        GameFrame grid = new GameFrame();
        grid.setSize(1000,600);
        grid.setDefaultCloseOperation(GameFrame.EXIT_ON_CLOSE);
        grid.setLocationRelativeTo(null);
        JPanel panel = new JPanel();
        panel.add(new NumberSquare(16));
        grid.add(panel);
        grid.setVisible(true);

    }

}