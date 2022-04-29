package prototype01;
public class Rectangle {
    private int x;
    private int y;
    private int w;
    private int h;

    Rectangle(int x, int y, int w, int h){
        if (x < 0 && y < 0 || w < 0 && h <  0){
            throw new IllegalArgumentException("Incorrect coordinates: "+x+", "+y);
        }
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }
    public boolean contains(int xClick, int yClick){
        return x <= xClick && xClick <= x+w && y <= yClick && yClick <= y+h;
    }
    public String toString(){
        //return "Rect: "+x +", "+y+ ", "+w+", "+h;
        return String.format("Rect: %d %d %d %d",x,y,w,h);
    }

}
