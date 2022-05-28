import java.util.Scanner;

public class Game {
    static int[][] data = new int[4][4];
    static int count = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);



        while (true){
            for (int i = 0; i < 4; i++){
                for (int j = 0; j < 4; j++){
                    setData(i,j,(in.nextInt()));
                }
            }
            System.out.print("cmd: ");
            String cmd = in.next();
            switch (cmd){
                case "moveLeft":
                    moveLeft();
                    print();
                    break;
                case "moveRight":
                    moveRight();
                    print();
                    break;
                case "stop":
                    return;
            }
        }
    }

    public static void setData(int i, int j, int n) {
        data[i][j] = n;
    }

    public static void print(){
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                System.out.printf("%5d",data[i][j]);
            }
            System.out.println();
        }
    }
    public static void init(){
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                data[i][j] = 0;
            }
        }
        int r = (int) (0 + Math.random() * 4);
        int c = (int) (0 + Math.random() * 4);
        if (data[r][c] == 0){
            data[r][c] = 0;
        }
    }
    public static void random(){
        boolean isEmpty = true;
        while(isEmpty){
            int r = (int) (0+Math.random()*4);
            int c = (int) (0+Math.random()*4);
            if (data[r][c] == 0){
                if (count % 10 == 0){
                    data[r][c] = 2;
                }else {
                    data[r][c] = 4;
                }
                isEmpty = false;
            }
            count++;
        }
    }
    public static void moveLeft(){
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                for (int k = j; k > 0; k--){
                    if (data[i][k-1] == 0){
                        data[i][k-1] = data[i][k];
                        data[i][k] = 0;
                    }
                }
            }
            for (int l = 0; l < 3; l++){
                if (data[i][l] == data[i][l+1]){
                    data[i][l] *= 2;
                    for (int m = l+1; m < 3; m++){
                        data[i][m] = data[i][m+1];
                    }
                    data[i][3] = 0;
                }
            }
        }
    }
    public static void moveRight(){
        for (int i = 0; i < 4; i++){
            for (int j = 3; j >= 0; j--){
                for (int k = j; k < 3; k++){
                    if (data[i][k+1] == 0){
                        data[i][k+1] = data[i][k];
                        data[i][k] = 0;
                    }
                }
            }
            for (int l = 3; l > 0; l--){
                if (data[i][l] == data[i][l-1]){
                    data[i][l] *= 2;
                    for (int m = l-1; m > 0; m--){
                        data[i][m] = data[i][m-1];
                    }
                    data[i][0] = 0;
                }
            }
        }
    }
}
