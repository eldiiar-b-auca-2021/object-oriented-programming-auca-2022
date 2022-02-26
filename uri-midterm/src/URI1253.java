import java.util.Scanner;

public class URI1253 {
    static Scanner in = new Scanner(System.in);

    public static void encryption(String plainText, int steps) {

        String res = "";
        char ch = ' ';
        if (steps > 26 || steps < 0) {
            System.exit(1);
        }
        for (int i = 0; i < plainText.length(); i++) {
            if (Character.isUpperCase(plainText.charAt(i))) {
                int firstCheck = (int) plainText.charAt(i) - steps;
                if (firstCheck < 65) {
                    int firstRes = (int) plainText.charAt(i) - steps + 26;
                    res += (char) firstRes;
                } else {
                    int secondRes = (int) plainText.charAt(i) - steps - 65;
                    int rt = secondRes % 26 + 65;
                    ch = (char) rt;
                    res += ch;
                }
            } else {
                System.exit(1);
            }
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        int iteration = in.nextInt();
        for (int i = 0; i < iteration; i++) {

            String text = in.next();
            int shift = in.nextInt();
            encryption(text, shift);
        }
    }
}
