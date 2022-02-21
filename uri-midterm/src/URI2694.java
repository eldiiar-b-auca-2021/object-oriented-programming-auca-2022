import java.util.Scanner;

public class URI2694 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0;
        int n = in.nextInt();
        while (i < n) {
            String letter  = in.next();
            String temp = "0";
            int sum = 0;
            for (int j = 0; j < letter.length(); j++) {
                char ch = letter.charAt(j);
                if (Character.isDigit(letter.charAt(j))) {
                    temp += ch;
                } else {
                    sum += Integer.parseInt(temp);
                    temp = "0";
                }
            }

            System.out.println(sum += Integer.parseInt(temp));
            i++;
        }
    }
}
