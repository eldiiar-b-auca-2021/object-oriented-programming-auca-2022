package prototype05;

import java.awt.*;

public class Rect extends Figure {
    private int w;
    private int h;

    public Rect(int x, int y, int w, int h) {
        super(x, y);
        if (w < 0) {
            throw new IllegalArgumentException("Rect: width < 0: " + w);
        }
        if (h < 0) {
            throw new IllegalArgumentException("Rect: height < 0: " + h);
        }
        this.w = w;
        this.h = h;
    }

    public boolean contains(int xClick, int yClick) {
        return x <= xClick && xClick <= x + w && y <= yClick && yClick <= y + h;
    }
    @Override
    public String toString(){
        return "Rect: "+x+", "+y+", "+w+", "+h;
        // return String.format()
    }
    @Override
    public void draw (Graphics g){
        g.setColor(Color.BLUE);
        g.fillRect(x, y, w, h);
        if (isSelected){
            g.setColor(Color.RED);
            g.drawRect(x,y,w,h);
        }
    }
}
