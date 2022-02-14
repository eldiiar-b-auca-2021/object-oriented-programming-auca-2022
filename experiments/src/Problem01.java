import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch; int j = 0;
        while(in.hasNext()) {
            String a = in.nextLine();
            for (int i = 0; i < a.length();i++) {
                ch = a.charAt(i);
                if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                    j++;
                }
            }
            int sum = (a.length()/j);
            System.out.println(sum);

        }
    }
}
