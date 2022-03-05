import processing.core.PApplet;

import javax.swing.*;

public class Main extends PApplet {
    static float MIN_RADIUS = 10;
    static float MAX_RADIUS = 40;

    int numberOfSnowflakes;

    Snowflakes[] snowflakes;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        try {
            numberOfSnowflakes = Integer.parseInt(JOptionPane.showInputDialog(null, "Number of snowflakes:"));
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Error: "+e.getMessage());
            System.exit(1);
        }

        snowflakes = new Snowflakes[numberOfSnowflakes];
        for(int i = 0; i < numberOfSnowflakes; ++i) {
           // create current snowflake
            snowflakes[i] = new Snowflakes(
                    this,
                    random(width),
                    random(height),
                    random(MIN_RADIUS,MAX_RADIUS),
                    random(2 * PI),
                    random(-PI / 20, PI / 20));
        }
    }

    public void draw() {
        background(0, 0, 0);
        for (int i = 0; i < numberOfSnowflakes; i++) {
            snowflakes[i].draw();
            snowflakes[i].move();
        }
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }
}