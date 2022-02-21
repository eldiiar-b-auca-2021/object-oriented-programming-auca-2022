import java.util.Scanner;

public class URI1239 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = 2;
        boolean test = true;
        while (in.hasNextLine()) {
            String sentence = in.nextLine();
            char[] words = sentence.toCharArray();
            for (int i = 0; i < words.length; i++) {
                if (words[i] == '_' && num % 2 == 0) {

                }
            }
        }
    }
}
