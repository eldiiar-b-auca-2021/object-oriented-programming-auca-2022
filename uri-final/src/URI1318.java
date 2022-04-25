import java.util.Scanner;

public class URI1318 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int first, second;
        while(in.hasNextInt()){
            first = in.nextInt();
            second = in.nextInt();
            if (first == 0 && second == 0){
                break;
            }
            int[] set = new int[10000];
            for(int i = 0; i < second; i++){
                int n = in.nextInt();
                set[n]++;
            }
            int count = 0;
            for (int i = 0; i < set.length; i++){
                if (set[i] >= 2){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
