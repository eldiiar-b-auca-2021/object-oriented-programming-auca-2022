import java.util.Scanner;

public class URI1558 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNextInt()){
            int numOfTwoSquares = in.nextInt();
            boolean sum = false;
            int j = 1;
            double root = Math.sqrt(numOfTwoSquares);
            for (int i = 0; i <= root; i++) {
                for ( j = 0; j <= root; j++) {
                    if ((i * i) + (j * j) == numOfTwoSquares) {
                        sum = true;
                        break;
                    }
                }
                if ((i*i) + (j*j) == numOfTwoSquares){
                    sum = true;
                    break;
                }
            }
                if (sum){
                    System.out.println("YES");
                }else {
                    System.out.println("NO");
                }

        }
    }
}
