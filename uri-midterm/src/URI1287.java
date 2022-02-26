import java.util.Scanner;

public class URI1287 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNextLine()) {
            StringBuilder r = new StringBuilder();
            String las = "";
            int count = 0;
            char[] ch = in.nextLine().toCharArray();
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] == 'o' || ch[i] == 'O') {
                    ch[i] = '0';
                } else if (ch[i] == 'l') {
                    ch[i] = '1';
                }
                if (ch[i] == '0') {
                    count++;
                }
                if (Character.isDigit(ch[i])) {
                    las += ch[i];
                }
            }
            if (las.isEmpty()) {
                System.out.println("error");
            } else if (checkInt(las)) {
                System.out.println("error");
            } else if (count == las.length()){
                System.out.println("0");
            } else {
                System.out.println(las);
            }
        }
    }

    private static boolean checkInt(String las) {
        boolean k = false;
        long j = Long.parseLong(las);
        if (j > Integer.MAX_VALUE) {
            k = true;
        }
        return k;
    }
}
