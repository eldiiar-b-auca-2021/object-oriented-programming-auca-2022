import java.util.Scanner;

public class URI1020 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNextLine()) {
            char a = in.next().charAt(0);
            String b = in.next();
            if (a == '0' && b.equals("0")) {
                System.exit(1);
            }
            String result = "";
            for (int i = 0; i < b.length(); i++) {
                if (b.charAt(i) != a) {
                    result += b.charAt(i);
                }
            }
            System.out.println(result);

        }

    }
}
