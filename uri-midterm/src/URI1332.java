import java.util.Scanner;

public class URI1332 {
    static String ONE = ".ne|on.|o.e";
    static String THREE = ".hree|t.ree|th.ee|thr.e";
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for (int i = 0; i < num; i++) {
            String letter = in.next();
            if (letter.matches(ONE)) {
                System.out.println(1);
            } else if(letter.matches(THREE)) {
                System.out.println(3);
            } else {
                System.out.println(2);
            }
        }
    }
}
