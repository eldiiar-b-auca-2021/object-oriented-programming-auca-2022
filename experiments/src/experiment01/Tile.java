package experiment01;

import javax.swing.*;
import java.awt.*;

public class Tile extends JComponent{
    Font FONT = new Font("Consolas", Font.PLAIN, 100);
    private int value = 0;
    Tile(int value){
        setFont(FONT);
        this.value = value;
        setPreferredSize(new Dimension(getWidth(),getHeight()));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Color color;
        if (value == 0){
            color = Color.DARK_GRAY;
        }else {
            int len = Integer.numberOfTrailingZeros(value);
            color = Color.getHSBColor(len/11.0f, 0.8f,0.5f);
        }
        g.setColor(color);
        g.fillRect(5,5,120,120);
        g.setColor(Color.DARK_GRAY);
        String txt = Integer.toString(value);
        g.setColor(Color.CYAN);
        g.drawString(txt,40, 90);
    }
    public void setValue(int value){
        this.value = value;
    }
    public int getValue(){
        return value;
    }
}
