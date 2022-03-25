import java.util.Scanner;
public class URI2062 {
    static final String FIRST = "OB";
    static final String SECOND = "UR";
    static final String THIRD = "ob";
    static final String FOURTH = "ur";
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int num = in.nextInt();
        String[] words = new String[num];
        for (int i = 0; i < num; i++){
            String word = in.next();
            if (word.length()==3) {
                if (word.startsWith("UR") || word.startsWith("OB") && !word.endsWith("I")){
                    word = word.substring(0,2)+"I";
                }
            }
            words[i] = word;
        }
        System.out.println(String.join(" ",words));
    }
}
