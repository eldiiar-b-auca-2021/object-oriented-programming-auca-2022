import java.util.Scanner;

public class URI1553 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        while (true) {
            int N = in.nextInt();
            int K = in.nextInt();
            if (N == 0 && K == 0){
                break;
            }
            int[] set = new int[1001];
            for (int i = 0; i < N; i++) {
                int n = in.nextInt();
                set[n]++;
            }

            int max = 0;
            for (int i = 0; i < set.length; i++) {
                if (set[i] >= K) {
                    max++;
                }
            }
            System.out.println(max);
        }
    }
}
