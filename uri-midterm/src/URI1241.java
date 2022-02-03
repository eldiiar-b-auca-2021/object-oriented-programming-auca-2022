import java.util.Scanner;

public class URI1241 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0;
        int num = in.nextInt();
        while (i < num) {
            String a = " ";
            String b = " ";
            char[] firstChar = in.next().toCharArray();
            char[] secondChar = in.next().toCharArray();
            for (int j = 0; j < firstChar.length; j++) {
                if (j >= firstChar.length-2) {
                  a+=firstChar[j];
                }
            }
            for (int k = 0; k < secondChar.length; k++) {
                if (k >= secondChar.length-2) {
                  b+=secondChar[k];
                }
            }
            if (a.equals(b)) {
                System.out.println("encaixa");
            } else {
                System.out.println("nao encaixa");
            }
            i++;
        }
    }
}