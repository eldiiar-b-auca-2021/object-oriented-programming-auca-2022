import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GameFrame extends JFrame{

    JPanel panelMain;
   // GamePanel panelGame;
    JButton btnLeft;
    JButton btnRight;
    JButton btnDown;
    JButton btnUp;
    JPanel panelButtons;
    NumberSquare numberSquare;
    Game2048 game = new Game2048();
    GameFrame(){

        panelMain = new JPanel();
        panelMain.setBackground(Color.GRAY);
        BoxLayout layout = new BoxLayout(panelMain,BoxLayout.Y_AXIS);
        panelMain.setLayout(layout);



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
        panelMain.setFocusable(true);
        panelMain.requestFocus();
        panelMain.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                    if (e.getKeyCode() == KeyEvent.VK_UP){
                        game.moveUp();
                        game.print();;
                        panelMain.add(new NumberSquare());
                    }else if (e.getKeyCode() == KeyEvent.VK_DOWN){
                        game.moveDown();
                    }else if (e.getKeyCode() == KeyEvent.VK_LEFT){
                        game.moveLeft();
                    }else if (e.getKeyCode() == KeyEvent.VK_RIGHT){
                        game.moveRight();
                    }
                    repaint();
                }
        });
        panelMain.add(new NumberSquare());
        panelMain.add(panelButtons);
        add(panelMain);

    }
    public static void main(String[] args) {
        GameFrame grid = new GameFrame();
        //grid.setSize(1000,600);
        grid.setDefaultCloseOperation(GameFrame.EXIT_ON_CLOSE);
        grid.setLocationRelativeTo(null);

        grid.setVisible(true);

    }

}