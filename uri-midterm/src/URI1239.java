import java.util.Scanner;

public class URI1239 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String letter = in.nextLine();
            while(letter.contains("_") || letter.contains("*")) {
                letter = letter.replaceFirst("_","<i>").replaceFirst("_","</i>");
                letter = letter.replaceFirst("\\*", "<b>").replaceFirst("\\*","</b>");
            }
            System.out.println(letter);
        }

    }
}
