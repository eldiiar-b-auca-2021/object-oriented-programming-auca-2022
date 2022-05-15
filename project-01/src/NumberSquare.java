import javax.swing.*;
import java.awt.*;

public class NumberSquare extends JComponent {
    static int SCALE = 100;
    static int BORDER = SCALE/20;
    static int FONT_SIZE = (int) (SCALE*4.0);
    static Font FONT = new Font("Consolas", Font.PLAIN, 100);;
    private int value;
    private int n = 0;
    Game2048 game = new Game2048();

    NumberSquare(int value){
        this.value = value;
        setFont(FONT);
        setPreferredSize(new Dimension(1000,1000));
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
        g.fillRoundRect(0,0,getWidth()-50,getHeight()-20,50,50);
        FontMetrics metrics = getFontMetrics(FONT);
        ((Graphics2D)g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        String txt = Integer.toString(value);
        g.setColor(Color.BLUE);
        g.drawString(txt,(getWidth()-metrics.stringWidth(txt))/2-20, getHeight()/2+metrics.getAscent()/3);
    }

}
