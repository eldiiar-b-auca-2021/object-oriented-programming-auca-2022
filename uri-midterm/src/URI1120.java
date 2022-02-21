import java.util.Scanner;
import java.util.SplittableRandom;

public class URI1120 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

         String failed, sequence;

        do {
            failed = scan.next();
            sequence = scan.next();
            if (!failed.equals("0") && !sequence.equals("0")) {
                System.out.println(deleteTheFailed(failed, sequence));
            }
        } while (!failed.equals("0") && !sequence.equals("0"));
    }

    public static String deleteTheFailed(String fail, String sequence) {

        String str = "";
        for (int i = 0; i < sequence.length(); i++) {
            if (sequence.charAt(i) != fail.charAt(0)) {
                str += sequence.charAt(i);
            }
        }

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') {
                count++;
            }
        }
        if (count == str.length()) {
            return "0";
        }
        int i = 0;
        while (str.charAt(i) == '0') {
            i++;
        }
        str = str.substring(i);
        return str;
    }
}