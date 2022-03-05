public class Snowflakes {
    Main main;
    private float x;
    private float y;
    private float r;
    private float angle;
    private float dAngle;
    public Snowflakes(Main aMain, float aX, float aY, float aR, float aAngle, float aDAngle) {
        main = aMain;
        x = aX;
        y = aY;
        r = aR;
        angle = aAngle;
        dAngle = aDAngle;
    }
    public void draw (){
        main.pushMatrix();
        main.translate(x, y);
        main.rotate(angle);
        float c = 255 * r / Main.MAX_RADIUS;
        main.stroke(c);
        float r2 = r / 2f;
        main.strokeWeight(4);
        main.line(-r, 0, r, 0);
        main.line(0, -r, 0, r);
        main.line(-r2, -r2, r2, r2);
        main.line(-r2, r2, r2, -r2);
        main.popMatrix();
    }

    public void move() {
        x += main.random(-r / 10, r / 5);
        y += r / 4;
        angle += dAngle;
        if (y > main.height + r) {
            x = main.random(main.width);
            y = -r;
            r = main.random(Main.MIN_RADIUS, Main.MAX_RADIUS);
            angle = main.random(2 * main.PI);
            dAngle = main.random(-Main.PI / 20, Main.PI / 20);
        }
    }
}
