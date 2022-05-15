import javax.swing.*;
import java.awt.*;

public class NumberSquare extends JComponent {
    static int SCALE = 100;
    static int BORDER = SCALE/20;
    static int FONT_SIZE = (int) (SCALE*4.0);
    static Font FONT = new Font("Consolas", Font.PLAIN, 40);;
    private int value;
    Game2048 game = new Game2048();

    NumberSquare(){

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
        game.init();
        for (int i = 1; i <=4; i++){
            for (int j =1; j <= 4; j++){
                g.fillRoundRect(100*j,100*i,100,100,50,50);
                String txt = Integer.toString(game.getCoordinates(i-1,j-1));
                g.setColor(Color.BLACK);
                g.drawString(txt, 100*j+40,100*i+60);
                g.setColor(color);
            }
        }

//        g.setColor(Color.BLUE);
//        FontMetrics metrics = getFontMetrics(FONT);
//        ((Graphics2D)g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//
//        String txt = Integer.toString(value);
//        g.drawString(txt,(getWidth()-metrics.stringWidth(txt))/2, getHeight()/2+metrics.getAscent()/3);
    }
}
