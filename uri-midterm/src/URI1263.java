import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;

public class URI1263 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numOfAl = 0;
        int num = 0;

        while (in.hasNextLine()) {
            String n = in.nextLine().toLowerCase();
            String[] split = n.split(" ");
            String a = split[0];
            for (int i = 1; i < split.length; ++i) {
                String b = split[i];
                if (b.charAt(0) == a.charAt(0)) {
                    numOfAl++;
                } else {
                    a = b;
                    continue;
                }
                if (i - 2 > 0) {
                    String c = split[i-2];
                    if (c.charAt(0) == b.charAt(0) && c.charAt(0) == a.charAt(0)) {
                        numOfAl = 0;
                    }
                    a = b;
                    num+=numOfAl;
                    numOfAl = 0;
                }
            }
            System.out.println(num);
            num = 0;
        }
    }
}
