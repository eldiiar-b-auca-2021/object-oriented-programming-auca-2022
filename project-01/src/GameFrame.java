import javax.swing.*;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GameFrame extends JFrame{

    JPanel panelMain;
    GamePanel panelGame;
    JButton btnLeft;
    JButton btnRight;
    JButton btnDown;
    JButton btnUp;
    JPanel panelButtons;
    NumberSquare numberSquare;
    Game2048 game;
    GameFrame(){
        game = new Game2048();
        panelMain = new JPanel();
        panelMain.setBackground(Color.GRAY);
        //BoxLayout layout = new BoxLayout(panelMain,BoxLayout.Y_AXIS);
        panelMain.setLayout(new BorderLayout());

        panelGame = new GamePanel(game.ROWS,game.COLUMNS);
        panelMain.add(panelGame,BorderLayout.CENTER);

        panelButtons = new JPanel();
        panelButtons.setBackground(Color.RED);
        panelButtons.setLayout(new GridBagLayout());

        add(new NumberSquare(16));
        GridBagConstraints contstraints = new GridBagConstraints();
        btnLeft = new JButton("Slide Left");
        btnLeft.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                game.moveLeft();
                game.print();
                updateNumSquares();
            }
        });
        contstraints.gridx = 0; contstraints.gridy = 1;
        panelButtons.add(btnLeft, contstraints);

        btnRight = new JButton("Slide Right");
        btnRight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                game.moveRight();
                game.print();
                updateNumSquares();
            }
        });
        contstraints.gridx = 2; contstraints.gridy = 1;
        panelButtons.add(btnRight, contstraints);

        btnDown = new JButton("Slide Down");
        btnDown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                game.moveDown();
                game.print();
                updateNumSquares();
            }
        });
        contstraints.gridx = 4; contstraints.gridy = 1;
        panelButtons.add(btnDown, contstraints);

        btnUp = new JButton("Slide Up");
        btnUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                game.moveUp();
                game.print();
                updateNumSquares();
            }
        });
        contstraints.gridx = 6; contstraints.gridy = 1;
        panelButtons.add(btnUp, contstraints);

        panelMain.add(panelButtons, BorderLayout.SOUTH);

        add(panelMain);
        game.init();
    }
    public static void main(String[] args) {
        GameFrame grid = new GameFrame();
        grid.setDefaultCloseOperation(GameFrame.EXIT_ON_CLOSE);
        grid.setLocationRelativeTo(null);
        grid.setVisible(true);

    }

    public void updateNumSquares(){
        game.random();
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                panelGame.setValue(i, j, game.getCoordinates(i,j));
            }
        }
        panelGame.repaint();
    }
}