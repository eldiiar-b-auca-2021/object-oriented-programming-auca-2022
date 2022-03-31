import java.util.Scanner;

public class URI2651 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String letter = in.next();
        String res = "";
        for (int i = 0; i < letter.length(); i++){
            res += Character.toLowerCase(letter.charAt(i));
        }
        if (res.contains("zelda")){
            System.out.println("Link Bolado");
        } else {
            System.out.println("Link Tranquilo");
        }
    }
}
