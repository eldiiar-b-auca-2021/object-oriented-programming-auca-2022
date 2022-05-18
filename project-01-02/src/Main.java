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
        fill(255,255,0);
        textSize(150);
        strokeWeight(15);
        text("Game 2048", width/4f, 100 );
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
                fill(204, 192, 179);
                switch (game.getCoordinates(i, j)) {
                    case 0:
                        fill(204, 192, 179);
                        break;
                    case 2:
                        fill(238, 228, 218);
                        break;
                    case 4:
                        fill(237, 224, 200);
                        break;
                    case 8:
                        fill(242, 177, 121);
                        break;
                    case 16:
                        fill(245, 149, 99);
                        break;
                    case 32:
                        fill(246, 124, 95);
                        break;
                    case 64:
                        fill(246, 94, 59);
                        break;
                    case 128:
                        fill(237, 207, 114);
                        break;
                    case 256:
                        fill(237, 200, 80);
                        break;
                    case 512:
                        fill(237, 197, 63);
                        break;
                    case 1024:
                        fill(237, 194, 46);
                        break;
                    case 2048:
                        fill(238, 288, 218, 73);
                        break;
                }
                stroke(50);
                strokeWeight(10);
                square(0 + j * sizeOfTile + 10 * (j + 1), 0 + i * sizeOfTile + 10 * (i + 1), sizeOfTile);
                if (game.getCoordinates(i, j) == 0) {
                    fill(204, 192, 179);
                } else {
                    textSize(100);
                    fill(255, 50, 255);
                    strokeWeight(15);
                    text(game.getCoordinates(i, j), 0 + j * sizeOfTile + 10 * (j + 1) + sizeOfTile/2f-40, 0 + i * sizeOfTile + 10 * (i + 1) + sizeOfTile/2f+30, sizeOfTile);
                }
            }
        }
        popMatrix();
    }
}
