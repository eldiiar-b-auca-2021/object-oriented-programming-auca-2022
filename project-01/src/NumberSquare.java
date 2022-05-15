import javax.swing.*;
import java.awt.*;

public class NumberSquare extends JComponent {
    static int SCALE = 100;
    static int BORDER = SCALE/20;
    static int FONT_SIZE = (int) (SCALE*4.0);
    static Font FONT = new Font("Consolas", Font.PLAIN, FONT_SIZE);;
    private int value;


    NumberSquare(int value){
        this.value = value;
        setFont(FONT);
        setPreferredSize(new Dimension(SCALE,SCALE));
    }

    public int getValue(){
        return value;
    }
    public void setValue(int value){
        this.value = value;
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.GREEN);
        g.fillRoundRect(0,0,getWidth(),getHeight(),20,20);

    }
}
