import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Game2048 {
    private int[][] data = new int[4][4];
    private int goal;
    private static final List<Integer> POSSIBLE_GOALS = Arrays.asList(8, 16, 32, 64);
    private static List<Integer> list = Arrays.asList(0,3);
    private static int count = 0;
    public Game2048(int goal) {
        if (!POSSIBLE_GOALS.contains(goal)) {
            throw new IllegalArgumentException("Incorrect goal");
        }
        this.goal = goal;
    }

    public Game2048() {
        this.goal = 16;
    }

    public void setAt(int row, int col, int v) {
        data[row][col] = v;
    }


    public void print() {
        for (int r = 0; r < 4; r++) {
            for (int c = 0; c < 4; c++) {
                System.out.printf("%5d", data[r][c]);
            }
            System.out.println();
        }
    }

    public void moveUp() {
        for (int c = 0; c < 4; c++) {
            for (int r = 0; r < 4; r++) {
                for (int i = r; i > 0; i--) {
                    if (data[i - 1][c] == 0) {
                        data[i - 1][c] = data[i][c];
                        data[i][c] = 0;
                    }
                }
            }
            for (int j = 0; j < 3; j++) {
                if (data[j][c] != 0 && data[j][c] == data[j + 1][c]) {
                    data[j][c] *= 2;
                    for (int k = j + 1; k < 3; k++) {
                        data[k][c] = data[k + 1][c];
                    }
                    data[3][c] = 0;
                }
            }
        }
    }

    public void moveLeft() {
        for (int r = 0; r < 4; r++) {
            for (int c = 0; c < 4; c++) {
                for (int i = c; i > 0; i--) {
                    if (data[r][i - 1] == 0) {
                        data[r][i - 1] = data[r][i];
                        data[r][i] = 0;
                    }
                }
            }
            for (int j = 0; j < 3; j++) {
                if (data[r][j] != 0 && data[r][j] == data[r][j + 1]) {
                    data[r][j] *= 2;
                    for (int k = j + 1; k < 3; k++) {
                        data[r][k] = data[r][k + 1];
                    }
                    data[r][3] = 0;
                }
            }
        }
    }

    public void moveRight() {
        for (int r = 0; r < 4; r++) {
            for (int c = 3; c >= 0; c--) {
                for (int i = c; i < 3; i++) {
                    if (data[r][i + 1] == 0) {
                        data[r][i + 1] = data[r][i];
                        data[r][i] = 0;
                    }
                }
            }
            for (int j = 3; j > 0; j--) {
                if (data[r][j] != 0 && data[r][j] == data[r][j - 1]) {
                    data[r][j] *= 2;
                    for (int k = j - 1; k > 0; k--) {
                        data[r][k] = data[r][k - 1];
                    }
                    data[r][0] = 0;
                }
            }
        }
    }


    public void moveDown() {
        for (int c = 0; c < 4; c++) {
            for (int r = 3; r >= 0; r--) {
                for (int i = r; i < 3; i++) {
                    if (data[i + 1][c] == 0) {
                        data[i + 1][c] = data[i][c];
                        data[i][c] = 0;
                    }
                }
            }
            for (int j = 3; j > 0; j--) {
                if (data[j][c] != 0 && data[j][c] == data[j - 1][c]) {
                    data[j][c] *= 2;
                    for (int k = j - 1; k > 0; k--) {
                        data[k][c] = data[k - 1][c];
                    }
                    data[0][c] = 0;
                }
            }
        }
    }

    public int getGoal() {
        return goal;
    }
    public void random(){
        Random rnd = new Random();
        boolean b = true;
        while(b){
            int c1 = (int) (Math.random()*4+0);
            int c2 = (int) (Math.random()*4+0);
            if (data[c1][c2] == 0){
              if (count % 10 == 0) {
                  data[c1][c2] = 2;
              }else {
                  data[c1][c2] = 4;
              }
            }
            b = false;
        }
    }
    public void init(){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                data[i][j] = 0;
            }
        }
        int randomIndex1 = (int)(0+Math.random()*4);
        int randomIndex2 = (int)(0+Math.random()*4);
        data[randomIndex1][randomIndex2] = 2;
        count++;
    }
}