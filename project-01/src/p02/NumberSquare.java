package p02;

import javax.swing.*;
import java.awt.*;

public class NumberSquare extends JComponent {
    static int SCALE = 100;
    static int BORDER = SCALE/20;
    static int FONT_SIZE = (int) (SCALE*4.0);
    static Font FONT = new Font("Consolas", Font.PLAIN, 100);;
    private int value;
    private int n = 0;

    NumberSquare(int value){
        this.value = value;
        setFont(FONT);
        setPreferredSize(new Dimension(600,600));
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
        Color color;
        if (value == 0){
            color = Color.CYAN;
        }else {
            int len = Integer.numberOfTrailingZeros(value);
            color = Color.getHSBColor(len/11.0f, 0.8f,0.5f);
        }
        g.setColor(color);
        g.fillRoundRect(100,50,getWidth(),getHeight(),0,0);
        FontMetrics metrics = getFontMetrics(FONT);
        ((Graphics2D)g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        String txt = Integer.toString(value);
        g.setColor(Color.BLUE);
        g.drawString(txt,(getWidth()-metrics.stringWidth(txt))/2, getHeight()/2);
    }

}
