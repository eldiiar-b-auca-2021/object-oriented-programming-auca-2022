package p09;

public class Model {
    public static int SIZE = 0;
    private int robotRow;
    private int robotCol;

    void moveUp(){
        if (robotRow > 0){
            --robotRow;
        }
    }
    void moveDown(){
        if (robotRow < 7){
            ++robotRow;
        }
    }
    void moveLeft(){
        if (robotCol > 0){
            --robotCol;
        }
    }
    void moveRight(){
        if (robotCol < 7){
            ++robotCol;
        }
    }

    public int getRobotCol() {
        return robotCol;
    }

    public int getRobotRow() {
        return robotRow;
    }
}
