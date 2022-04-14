import java.util.Scanner;

public class URI1437 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases;
        while ((testCases = in.nextInt()) != 0) {
            int dir = 0;
            String direction = in.next();
            char d = ' ';
            for (int i = 0; i < testCases; i++) {
                d = direction.charAt(i);
                switch (d) {
                    case 'D':
                        dir = dir == 3 ? 0 : dir + 1;
                        break;
                    case 'E':
                        dir = dir == 0 ? 3 : dir - 1;
                        break;
                }
            }
            switch (dir) {
                case 0:
                    System.out.println("N");
                    break;
                case 1:
                    System.out.println("L");
                    break;
                case 2:
                    System.out.println("S");
                    break;
                case 3:
                    System.out.println("O");
            }
        }

    }
}
