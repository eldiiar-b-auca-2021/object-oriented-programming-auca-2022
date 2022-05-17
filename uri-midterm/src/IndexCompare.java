import java.util.Scanner;

public class IndexCompare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arman = new int[3];
        int[] dalida = new int[3];
        for (int i = 0; i < 3; i++){
            arman[i] = in.nextInt();
        }
        for (int j = 0; j < 3; j++){
            dalida[j] = in.nextInt();
        }
        int scoreOfArman = 0;
        int scoreOfDalida = 0;
        for (int i = 0; i < 3; i++){
            if (arman[i] > dalida[i]){
                scoreOfArman++;
            }else if (arman[i] < dalida[i]){
                scoreOfDalida++;
            }
        }
        System.out.println(scoreOfArman + " "+ scoreOfDalida);
    }
}
