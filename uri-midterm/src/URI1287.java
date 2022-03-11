import java.util.Scanner;

public class URI1287 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNextLine()) {
            String las = "";
            String j = in.nextLine();

            j = j.replaceAll(",", "");
            j = j.replaceAll("O", "0");
            j = j.replaceAll("l", "1");
            j = j.replaceAll("o", "0");
            j = j.replaceAll(" ", "");

            if (j.length() == 0) {
                System.out.println("error");
            } else {
                StringBuilder letter = new StringBuilder(j);
                while (letter.length() > 0 && letter.charAt(0) == '0') {
                    letter.deleteCharAt(0);
                }
                if (letter.length() == 0) {
                    letter.append("0");
                }
                try {
                    int d = Integer.parseInt(letter.toString());
                    System.out.println(letter);
                } catch (Exception e) {
                    System.out.println("error");
                }
            }
        }
    }
}