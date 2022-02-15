import java.util.Scanner;

public class URI1871 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNextLine()) {
            int n = in.nextInt();
            int d = in.nextInt();

            if (n == 0 && d == 0) {
                break;
            }
            String letter = Integer.toString(d+n);
                letter = letter.replace("0" , "");
            System.out.println(letter);
        }
    }
}
