import java.util.Scanner;

public class URI1238 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int i = 0;
        while (i < n) {
            char[] firstLetters = in.next().toCharArray();
            char[] secondLetters = in.next().toCharArray();
            String result = " ";
            for (int j = 0; j < (firstLetters.length+secondLetters.length); j++) {
                if (j < firstLetters.length) {
                    result += firstLetters[j];
                }
                if (j < secondLetters.length) {
                    result += secondLetters[j];
                }
            }
            System.out.println(result);
            i++;
        }
    }
}
