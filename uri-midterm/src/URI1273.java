import java.util.Scanner;

public class URI1273 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean isFirst = true;
        for (int n; (n = in.nextInt()) != 0;) {
            if (!isFirst) {
                System.out.println();
            }
            isFirst = false;
            int maxLength = 0;
            String[] words = new String[n];
            for (int i = 0; i < n; i++) {
                words[i] = in.next();

                maxLength = Math.max(words[i].length() , maxLength);

            }
            for (String w : words) {
                System.out.printf("%" + maxLength + "s%n",w);
            }
        }
    }
}
