public class Board {
    public final static int DEFAULT_BOARD_SIZE = 4;

    private int[][] cells;
    private int maxNum;
    public Board(){
        this(DEFAULT_BOARD_SIZE);
    }
    public Board(int size){
        cells = new int[size][size];
        maxNum = 2;
        createRandomCells(2);
    }
    public void shiftUp() {
    }

    public void shiftDown() {
    }

    public void shiftRight() {

    }

    public void shiftLeft() {
    }

    public void present(Board board) {

    }
    private void createRandomCells(int amount){

    }
}
