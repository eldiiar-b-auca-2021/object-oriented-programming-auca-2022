import java.util.Scanner;

public class Kattis2048 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Game2048 game = new Game2048();
        for (int r = 0; r < 4; r++) {
            for (int c = 0; c < 4; c++) {
                int x = in.nextInt();
                game.setAt(r, c, x);
            }
        }

        while (true) {
            int userSmd = in.nextInt();
            switch (userSmd) {
                case 0:
                    game.moveLeft();
                    break;
                case 1:
                    game.moveRight();
                    break;
                case 2:
                    game.moveUp();
                    break;
                case 3:
                    game.moveDown();
                    break;
            }
            game.print();
        }
    }
}

class Game2048 {
    private int[][] data = new int[4][4];

    public void setAt(int row, int col, int value) {
        data[row][col] = value;
    }

    public void print() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%5d", data[i][j]);
            }
            System.out.println();
        }
    }

    public void moveLeft() {
        changeZeroToValueForLeftShift();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (data[i][j] == data[i][j + 1]) {
                    data[i][j] = data[i][j+1] * 2;
                    data[i][j+1] = 0;
                }
            }
        }
        changeZeroToValueForLeftShift();
    }

    private void changeZeroToValueForLeftShift() {
        for (int r = 0; r < 4; r++) {
            for (int c = 0; c < 3; c++) {
                if (data[r][c] == 0) {
                    for (int k = c+1; k < 4;k++){
                        if (data[r][k] != 0){
                            data[r][c] = data[r][k];
                            data[r][k] = 0;
                            break;
                        }
                    }
                }
            }
        }
    }

    public void moveRight() {
        changeZeroToValueForRightShift();
        for (int i = 0; i < 4; i++) {
            for (int j = 3; j > 0; j--) {
                if (data[i][j] == data[i][j - 1]) {
                    data[i][j] = data[i][j-1] * 2;
                    data[i][j-1] = 0;
                }
            }
        }
        changeZeroToValueForRightShift();
    }

    private void changeZeroToValueForRightShift() {
        for (int i = 0; i < 4; i++) {
            for (int j = 3; j >= 0; j--) {
                if (data[i][j] == 0) {
                    for (int k = j-1; k >= 0; k--){
                        if (data[i][k] != 0) {
                            data[i][j] = data[i][k];
                            data[i][k] = 0;
                            break;
                        }
                    }
                }
            }
        }

    }

    public void moveUp() {
        changeZeroToValueForUPShift();
        for (int i = 0; i < 4; i++) {
            for (int j = 3; j > 0; j--) {
                if (data[j][i] == data[j - 1][i]) {
                    data[j - 1][i] = data[j][i] * 2;
                    data[j][i] = 0;
                }
            }
        }
        changeZeroToValueForUPShift();
    }

    private void changeZeroToValueForUPShift() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (data[j][i] == 0) {
                    for (int k = j+1; k < 4; k++){
                        if(data[k][i] != 0){
                            data[j][i] = data[k][i];
                            data[k][i] = 0;
                            break;
                        }
                    }
                }
            }
        }
    }

    public void moveDown() {
        changeZeroToValueForDownShift();
        for (int i = 0; i < 4; i++){
            for (int j = 3; j > 0; j--){
                if (data[j][i] == data[j-1][i]){
                    data[j][i] = data[j-1][i]*2;
                    data[j-1][i] = 0;
                }
            }
        }
        changeZeroToValueForDownShift();
    }

    private void changeZeroToValueForDownShift() {
        for (int i = 0; i < 4; i++){
            for (int j = 3; j >= 0; j--){
                if (data[j][i] == 0){
                    for (int k = j-1; k >= 0; k--){
                        if (data[k][i] != 0){
                            data[j][i] = data[k][i];
                            data[k][i] = 0;
                            break;
                        }
                    }
                }
            }
        }
    }
}