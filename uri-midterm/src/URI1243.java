import java.util.Scanner;

public class URI1243 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String letter;
        while (in.hasNextLine()) {
            letter = in.nextLine();
            int count = 0;
            int sum = 0;
            int sum2 = 0;
            String[] str = letter.split("\\s");
            for (String r : str) {
                for (int i = 0; i < r.length(); i++) {
                    if (Character.isLetter(r.charAt(i) ) ) {
                        count++;
                    } else if (!Character.isLetter(r.charAt(r.length()-1)) && Character.isLetter(r.charAt(i))){
                        count++;
                    } else {
                        count = 0;
                    }
                }
                if (count == r.length()) {
                    sum++;
                    sum2 += r.length();
                }
                count = 0;
            }



            int result = 0;



            if (sum == 0 || (sum2 / sum <= 3)) {
                System.out.println("250");
            } else {
                result = sum2 / sum;
            }

            if (result == 5 || result == 4) {
                System.out.println("500");
            } else if (result > 5) {
                System.out.println("1000");
            }

        }





    }
}

