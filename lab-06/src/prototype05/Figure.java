package prototype05;

import java.awt.*;

public abstract class Figure {

    protected int x;
    protected int y;
    protected boolean isSelected;
    public Figure(int x, int y){
        this.x = x;
        this.y = y;
        this.isSelected =false;
    }
    public abstract boolean contains(int x, int y);

    public void draw(Graphics g){

    }
    public void move (int dX, int dY){
       x += dX;
       y += dY;
    }
    public void setSelected(boolean state){
        isSelected = state;
    }
}
