import java.util.ArrayList;
import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Character> word1 = new ArrayList<>();
        ArrayList<Character> word2 = new ArrayList<>();
        String first = in.next();
        String second = in.next();
        for (int i = 0; i < first.length(); i++){
            word1.add(first.charAt(i));
        }
        for (int i = 0; i < second.length(); i++){
            word2.add(second.charAt(i));
        }
        int steps = 0;
        for (int i = 0; i < word1.size(); i++){
            for (int j = 0; j < word2.size(); j++){
                if (word1.get(i).equals(word2.get(j))){
                    steps++;
                    word1.remove(i);
                    word2.remove(j);
                    if (i != 0 && j != 0)
                    i--;
                    j--;
                }
            }
        }
        int result = (first.length()-steps + second.length()-steps);
        System.out.println(result);
    }
}
