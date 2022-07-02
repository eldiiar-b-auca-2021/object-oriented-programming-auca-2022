import java.util.ArrayList;

public class Board {
    static class Point{
        private int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public final static int DEFAULT_BOARD_SIZE = 4;

    private int[][] cells;
    private int maxNum;

    public Board(){
        this(DEFAULT_BOARD_SIZE);
    }
    public Board(int size){
        cells = new int[size][size];
        maxNum = 2;
        //createRandomCells(2);
    }
    public int getNumber(int y, int x){
        return cells[y][x];
    }
    public int getSize(){
        return cells.length;
    }

    public int getMaxNum() {
        return maxNum;
    }

    public void shiftUp() {
        for (int x = 0; x < getSize(); x++){
            for (int y = 0; y < getSize(); y++){
                moveCell(x, y, 0, -1);
            }
        }
        createRandomCells(1);
    }

    public void shiftDown() {
        for (int x = 0; x < getSize(); x++){
            for (int y = getSize()-1; y >= 0; y--){
                moveCell(x, y, 0, 1);
            }
        }
        createRandomCells(1);
    }

    public void shiftRight() {
        for (int y = 0; y < getSize(); y++){
            for (int x = getSize()-1; x >= 0; x--){
                moveCell(x, y, 1, 0);
            }
        }
        createRandomCells(1);
    }

    public void shiftLeft() {
        for (int y = 0; y < getSize(); y++){
            for (int x = 0; x < getSize(); x++){
                moveCell(x, y, -1, 0);
            }
        }
        createRandomCells(1);
    }



    public String toString(){
        var res = new StringBuilder();
        String format = "%" + String.valueOf(getMaxNum()).length() + "s ";
        for (int y = 0; y < getSize(); y++){
            for (int x = 0; x < getSize(); x++){
                int num = getNumber(y, x);
                if (num == 0){
                    res.append(String.format(format, "-"));
                }else {
                    res.append(String.format(format, cells[y][x]));
                }
            }
            res.append('\n');
        }
        return res.toString();
    }
    public void present(Board board) {

    }
    private void createRandomCells(int amount){
        var unOccupiedCells = new ArrayList<>();
        for (int y = 0; y < getSize(); y++){
            for (int x = 0; x < getSize(); x++){
                if (getNumber(y, x) == 0){
                    unOccupiedCells.add(new Point(x, y));
                }
            }
        }
        for (int i = 0; i < amount && unOccupiedCells.size() > 0; i++){
            int randomIndex = (int)(Math.random() * unOccupiedCells.size());
            Point point = (Point) unOccupiedCells.get(randomIndex);
            cells[point.y][point.x] = 2;
        }
    }
    private void moveCell(int x, int y, int dx, int dy) {
        if (getNumber(x, y) == 0) return;

        int nextX = x + dx;
        int nextY = y + dy;
        while(areCoordinates(nextX, nextY) && getNumber(nextX, nextY) == 0){
            cells[nextY][nextX] = getNumber(x, y);
            cells[y][x] = 0;
            x = nextX;
            y = nextY;
            nextX += dx;
            nextY += dy;
        }
    }
    private boolean areCoordinates(int x, int y){
        return x >= 0 && x < getSize() &&
                y >= 0 && y < getSize();
    }
}
