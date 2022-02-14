import java.util.Scanner;

public class Characters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inp = in.nextLine();

        int alpha = 0;
        char ch;
        for (int i = 0; i < inp.length(); i++) {
            ch = inp.charAt(i);
            if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                alpha+=ch;
            }
        }
        System.out.println(alpha);
    }
}
