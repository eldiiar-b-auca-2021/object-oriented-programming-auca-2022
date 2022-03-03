import processing.core.*;

import javax.swing.*;

public class Main extends PApplet {
    static float MIN_RADIUS = 10;
    static float MAX_RADIUS = 40;

    int numberOfSnowflakes = 100;

    float[] x;
    float[] y;
    float[] r;
    float[] angle;
    float[] dAngle;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        numberOfSnowflakes = Integer.parseInt(JOptionPane.showInputDialog(null, "Number of snowflakes:"));
        x = new float[numberOfSnowflakes];
        y = new float[numberOfSnowflakes];
        r = new float[numberOfSnowflakes];
        angle = new float[numberOfSnowflakes];
        dAngle = new float[numberOfSnowflakes];

        for(int i = 0; i < numberOfSnowflakes; ++i) {
            x[i] = random(width);
            y[i] = random(height);
            r[i] = random(MIN_RADIUS, MAX_RADIUS);
            angle[i] = random(2 * PI);
            dAngle[i] = random(-PI / 20, PI / 20);
        }
    }

    public void draw() {
        background(0, 0, 0);

        for (int i = 0; i < numberOfSnowflakes; i++) {
            drawSnowFlake(x[i], y[i], r[i], angle[i]);

            x[i] += random(-r[i] / 10, r[i] / 10);
            y[i] += r[i] / 4;
            angle[i] += dAngle[i];
            if (y[i] > height + r[i]) {
                x[i] = random(width);
                y[i] = -r[i];
                r[i] = random(MIN_RADIUS, MAX_RADIUS);
                angle[i] = random(2 * PI);
                dAngle[i] = random(-PI / 20, PI / 20);
            }
        }
    }

    void drawSnowFlake(float x, float y, float r, float angle) {
        pushMatrix();
        translate(x, y);
        rotate(angle);
        float c = 255 * r / MAX_RADIUS;
        stroke(c);
        float r2 = r / 2f;
        strokeWeight(4);
        line(-r, 0, r, 0);
        line(0, -r, 0, r);
        line(-r2, -r2, r2, r2);
        line(-r2, r2, r2, -r2);
        popMatrix();

    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }
}