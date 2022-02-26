import java.util.Scanner;

public class URI2242 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final String englishVowels = "aeiou";
        String msg = in.next();
        StringBuilder vowels = new StringBuilder();

        for (char c : msg.toCharArray()) {
            if (englishVowels.indexOf(c) != -1) {
                vowels.append(c);
            }
        }
        StringBuilder copy = new StringBuilder(vowels.toString());
        copy.reverse();

        System.out.println(vowels.toString().equals(copy.toString()) ? 'S': 'N');
    }
}
