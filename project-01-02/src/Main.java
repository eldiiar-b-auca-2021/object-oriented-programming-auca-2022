import processing.core.PApplet;

public class Main extends PApplet {
    public static float initialX;
    public static float initialY;
    public static float sizeOfTile;
    Game2048 game;

    public static void main(String[] args) {
        PApplet.main("Main");
    }

    public void settings() {
        fullScreen();
    }

    public void setup() {
        initialX = width / 2f - 300;
        initialY = height / 2f - 300;
        sizeOfTile = 137.5F;
        game = new Game2048();
        game.init();
    }

    public void draw() {
        background(0, 0, 0);
        drawGameBoard();
    }

    public void keyPressed() {
        switch (keyCode) {
            case UP:
                game.moveUp();
                game.random();
                drawGameBoard();
                break;
            case DOWN:
                game.moveDown();
                game.random();
                drawGameBoard();
                break;
            case RIGHT:
                game.moveRight();
                game.random();
                drawGameBoard();
                break;
            case LEFT:
                game.moveLeft();
                game.random();
                drawGameBoard();
                break;
        }
    }

    private void drawGameBoard() {
        pushMatrix();

        translate(initialX, initialY);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                switch(game.getCoordinates(i,j)){
                    case 2 -> fill();

                }
                fill(155, 155, 155);
                stroke(50);
                strokeWeight(10);
                square(0 + j * sizeOfTile + 10 * (j + 1), 0 + i * sizeOfTile + 10 * (i + 1), sizeOfTile);

                stroke(50);
                strokeWeight(10);
                fill(255, 0, 0);
                square(0 + j * sizeOfTile + 10 * (j + 1), 0 + i * sizeOfTile + 10 * (i + 1), sizeOfTile);


                fill(0, 0, 255);
                text(game.getCoordinates(i, j), 0 + j * sizeOfTile + 10 * (j + 1) + 30, 0 + i * sizeOfTile + 10 * (i + 1) + 100, sizeOfTile);

            }
            textSize(100);

        }
        popMatrix();
    }
}
