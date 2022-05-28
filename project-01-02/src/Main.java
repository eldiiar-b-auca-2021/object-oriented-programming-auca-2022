import processing.core.PApplet;

public class Main extends PApplet {
    public float initialX;
    public float initialY;
    public float sizeOfTile;
    Game2048 game;
    Lost lost;
    int[] possibleGoals;
    int count, currentGoal;
    public static void main(String[] args) {
        PApplet.main("Main");
    }

    public void settings() {
        fullScreen();
    }

    public void setup() {
        count = 0;
        currentGoal = 0;
        possibleGoals = new int[]{8, 16, 32, 64, 128, 256, 512, 1024, 2048};
        initialX = width / 2f - 300;
        initialY = height / 2f - 300;
        sizeOfTile = 150;
        game = new Game2048();
        lost = new Lost();
        game.init();
    }

    public void draw() {
        background(0, 0, 0);
        noStroke();
        drawGameBoard();
        drawText();

    }

    public void drawYouAreWinner() {
        if (game.checkForGoal()){
            noStroke();
            fill(50,50,50);
            rect(width/4f,height/4f,600,600);
            textSize(100);
            text("You are winner",width/4f,height/3f);
        }
    }



    private void drawText() {
        fill(255,255,0);
        textSize(150);
        strokeWeight(15);
        text("Game 2048", width/4f, 100 );
        fill(255,255,0);
        textSize(80);
        text("Score: "+game.getScore(), width-400, height/2f-100);
        fill(255,255,0);
        textSize(80);
        text("Best: "+game.getScore(), width-400, height/2f+100);
        fill(255,255,0);
        textSize(80);
        text("Goal: "+game.getGoal(), 100,height/2f);

    }

    public void keyPressed() {
        switch (keyCode) {
            case UP:
                game.moveUp();
                game.random();
                lost.youLost();
                youLost();
                //drawGameBoard();
                break;
            case DOWN:
                game.moveDown();
                game.random();
                lost.youLost();
                youLost();
                //drawGameBoard();
                break;
            case RIGHT:
                game.moveRight();
                game.random();
                lost.youLost();
                youLost();
                //drawGameBoard();
                break;
            case LEFT:
                game.moveLeft();
                game.random();
                lost.youLost();
                youLost();
                //drawGameBoard();
                break;
        }
        if(key == '+'){
            game.changeGoalForPlus();
        }else if (key == '-'){
            game.changeGoalForMinus();
        }
    }

    private void youLost() {
        if (lost.youLost()){
            fill(255,0,0);
            System.out.println("You lost");
            rect(width/4f,height/3f,400,400);
            textSize(100);
            text("You lost",width/4f,height/3f+200);
        }
    }

    private void drawGameBoard() {
        pushMatrix();
        translate(initialX, initialY);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                defineColor(i, j);
                fill(255,50,255);
                textSet(i,j);
            }
        }
        lost.youLost();
        youLost();
        popMatrix();
    }

    private void textSet(int i, int j) {
        switch(game.getCoordinates(i,j)){
            case 2:
            case 4:
            case 8:
                textSize(100);
                text(game.getCoordinates(i,j), j * sizeOfTile+sizeOfTile/2-20, i * sizeOfTile+sizeOfTile/2+20);
                break;
            case 16:
            case 32:
            case 64:
                textSize(90);
                text(game.getCoordinates(i,j), j * sizeOfTile+sizeOfTile/2-40, i * sizeOfTile+sizeOfTile/2+20);
                break;
            case 128:
            case 256:
            case 512:
                textSize(80);
                text(game.getCoordinates(i,j), j * sizeOfTile+sizeOfTile/2-60, i * sizeOfTile+sizeOfTile/2+20);
                break;
        }
    }

    private void defineColor(int i, int j) {
        stroke(50);
        strokeWeight(10);
        fill(0, 0, 0);
        switch(game.getCoordinates(i,j)){
            case 128:
                fill(20,20,20);
                break;
            case 1024:
                fill(50,50,50);
                break;
            case 2048:
                fill(100,100,100);
                break;
        }
        square( j * sizeOfTile , i * sizeOfTile , sizeOfTile);
    }
}
