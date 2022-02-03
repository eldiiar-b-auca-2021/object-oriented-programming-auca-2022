import java.util.Scanner;

public class URI1241 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0;
        int num = in.nextInt();
        while (i < num) {
            String a = in.next();
            String b = in.next();
            if (a.endsWith(b)) {
                System.out.println("encaixa");
            } else {
                System.out.println("nao encaixa");
            }

            i++;
        }
    }
}