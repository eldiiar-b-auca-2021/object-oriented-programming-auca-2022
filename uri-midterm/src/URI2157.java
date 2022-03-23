import java.util.Scanner;

public class URI2157 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        for (int i = 0; i < num; i++) {
            int first = in.nextInt();
            int second = in.nextInt();
            String beforeRev = "";
            for (int j = first; j <= second; j++) {
               beforeRev += Integer.toString(j);
            }
            StringBuilder letter = new StringBuilder(beforeRev);
            letter.reverse();
            System.out.println(beforeRev+letter);
            letter.delete(0,letter.length());
        }
    }
}
