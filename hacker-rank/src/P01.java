import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        byte num = in.nextByte();
        char[] letters = new char[num];
        for (int i = 0; i < num; i++){
            letters[i] = in.next().charAt(0);
            in.nextLine();
        }
        //in.nextLine();
        byte step = in.nextByte();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < letters.length; i++){
            if (Character.isLowerCase(letters[i])){
                int n = (int) letters[i]+step;
                if (n > 122){
                    n = n-26;
                }
                letters[i] = (char) n;
            }else if (Character.isUpperCase(letters[i])){
                int n = (int) letters[i]+step;
                if (n > 90){
                    n = n-26;
                }
                letters[i] = (char) n;
            }
            result.append(letters[i]);
        }
        System.out.println(result);
        result.delete(0,result.length());
    }
}
