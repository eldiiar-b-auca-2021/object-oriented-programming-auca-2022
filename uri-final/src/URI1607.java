import java.util.ArrayList;
import java.util.Scanner;

public class URI1607 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        for (int i = 0; i < num; i++){
            int iteration = in.nextInt();
            int[] set = new int[iteration];
            int count = 0;

            for (int j = 0 ; j < iteration; j++){
                set[j] = in.nextInt();
            }
            boolean isYes;
            for (int j = 0; j < set.length; j++){
                isYes = true;
                for (int k = j+1; k < set.length; k++){
                    if (set[j] == set[k]){
                        isYes = false;
                    }
                }
                if (isYes){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
