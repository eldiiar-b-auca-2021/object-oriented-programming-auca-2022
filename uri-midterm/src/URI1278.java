import java.util.Locale;
import java.util.Scanner;

public class URI1278 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int isFirst = 0;
        while ((n = in.nextInt()) != 0) {
            if (isFirst == 1) {
                System.out.println();
            }
            String[] str = new String[n];
            String s;
            int max = 0;
            in.nextLine();
            for (int i = 0; i < n; i++ ){
                s = in.nextLine();
                s = s.toUpperCase();
                s = s.trim().replaceAll("\\s+", " ");
                if (s.length() > max) {
                    max = s.length();
                }
                str[i] = s;
            }
            for (int j = 0; j < str.length; j++) {
                int space = Math.abs(max-str[j].length());
                System.out.print(" ".repeat(space));
                System.out.println(str[j]);
            }
            isFirst = 1;
        }
    }
}
