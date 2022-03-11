import java.util.Scanner;

public class URI2484 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNextLine()) {
            String a = in.next();
            int pos = 1;
            int len = a.length();
            char[] ch = a.toCharArray();
            for (int i = 0; i < ch.length; i++) {
                for (int j = 0; j < len; j++) {
                    if (j == 0) {
                        System.out.printf("%" + pos + "s", ch[j]);
                        j+=1;
                    }
                    if (len != 1) {
                        System.out.print(" " + ch[j]);
                    }
                }
                System.out.println();
                pos+=1;
                len--;
            }
            System.out.println();
        }
    }
}
