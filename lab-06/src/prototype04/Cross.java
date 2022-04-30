package prototype04;

public class Cross extends Figure{
    public Rect vRectangle;
    public Rect hRectangle;

    public Cross(int x, int y, int w, int h){
      super(x, y);
      vRectangle = new Rect(x-w/2, y - h/2, w, h);
      hRectangle = new Rect(x-h/2, y - w/2, h, w);
    }

    @Override
    public boolean contains(int xClick, int yClick){
        return vRectangle.contains(xClick, yClick) || hRectangle.contains(xClick, yClick);
    }

    @Override
    public String toString(){
        return String.format("Circle %s; %s\n",vRectangle, hRectangle);
    }
}
