import java.util.Scanner;

public class URI1607 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int cases = in.nextInt();

        for (int i = 0; i < cases; i++) {
            int res = 0;
            String a = in.next();
            String b = in.next();
            for (int j = 0; j < a.length(); j++) {
                char first = a.charAt(j);
                char second = b.charAt(j);
                while (first != second) {
                    if (first > 'z') {
                        first = 'a';
                    } else {
                        first++;
                        res++;
                    }
                }
            }
            System.out.println(res);
        }
    }
}
