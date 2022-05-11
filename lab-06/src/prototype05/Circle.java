package prototype05;

import java.awt.*;

public class Circle extends Figure {
    private int r;
    public Circle(int x, int y, int r){
        super(x, y);
        if (r < 0){
            throw new IllegalArgumentException("Circle: radius < 0: "+r);
        }
        this.x = x;
        this.y = y;
        this.r = r;

    }

    public boolean contains(int xClick, int yClick) {
        int dx = xClick - x;
        int dy = yClick - y;
        return r * r >= dx * dx + dy * dy;
    }
    public String toString() {
        return String.format("Circle: %d %d %d%n", x, y, r);
    }

    @Override
    public void draw (Graphics g){
        g.setColor(Color.BLUE);
        g.fillOval(x-r, y-r,2*r, 2*r);
        if (isSelected){
            g.setColor(Color.RED);
            g.drawOval(x-r,y-r,r*2,r*2);
        }
    }
}
