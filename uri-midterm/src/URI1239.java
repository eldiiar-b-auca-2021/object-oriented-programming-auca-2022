import java.util.Scanner;

public class URI1239 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String letter = in.nextLine();
            letter = letter.replaceAll("_([^_]*)_","<i>$1</i>");
            letter = letter.replaceAll("\\*([^*]*)\\*","<b>$1</b>");

            System.out.println(letter);
        }

    }
}
