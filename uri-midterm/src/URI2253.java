import java.util.Scanner;

public class URI2253 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            int firstCheck = 0;
            int secondCheck = 0;
            int thirdCheck = 0;
            String letter = in.nextLine();
            if (letter.length() >= 6 && letter.length() <= 32) {
                for (int i = 0; i < letter.length(); i++) {
                    if (letter.charAt(i) >= 'a' && letter.charAt(i) <= 'z') {
                        firstCheck++;
                    } else if (letter.charAt(i) >= 'A' && letter.charAt(i) <= 'Z') {
                        secondCheck++;
                    } else if (letter.charAt(i) >= '0' && letter.charAt(i) <= '9') {
                        thirdCheck++;
                    }
                }
                if (firstCheck == 0 || secondCheck == 0 || thirdCheck == 0) {
                    System.out.println("Senha invalida.");
                } else if (firstCheck+secondCheck+thirdCheck == letter.length()) {
                    System.out.println("Senha valida.");
                } else {
                    System.out.println("Senha invalida.");
                }
            } else {
                System.out.println("Senha invalida.");
            }
        }
    }
}
