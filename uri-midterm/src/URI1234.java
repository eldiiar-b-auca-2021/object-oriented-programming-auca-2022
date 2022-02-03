import java.util.Scanner;

public class URI1234 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(in.hasNextLine()) {
            char[] chars = in.nextLine().toCharArray();
            int numOfLetters = 0;
            for (int i = 0; i < chars.length; ++i) {
                if (Character.isLetter(chars[i])) {
                    chars[i] = numOfLetters % 2 == 0 ? Character.toUpperCase(chars[i]) : Character.toLowerCase(chars[i]);
                    ++numOfLetters;
                }
            }
            System.out.println(chars);
        }
    }
}
