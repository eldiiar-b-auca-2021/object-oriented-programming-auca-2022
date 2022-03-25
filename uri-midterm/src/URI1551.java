import java.util.Scanner;

public class URI1551 {
    static final String[] ALPHABET = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        in.nextLine();
        for (int i = 0; i < num; i++) {
            String letter = in.nextLine();
            int count = 0;
            for(String l : ALPHABET){
                if (letter.contains(l)){
                    count++;
                }
            }
            if (count == 26){
                System.out.println("frase completa");
            } else if (count >= 13) {
                System.out.println("frase quase completa");
            } else {
                System.out.println("frase mal elaborada");
            }
        }
    }
}
