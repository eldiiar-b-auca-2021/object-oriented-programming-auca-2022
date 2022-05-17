import java.util.Scanner;

public class FunnyString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        StringBuilder line = new StringBuilder();
        for (int i = 0; i < testCases; i++){
            line.append(in.next());
            int[] first = new int[line.length()];
            for (int j = 0; j < line.length()-1; j++){
                first[j] = Math.abs(line.charAt(j) - line.charAt(j+1));
            }
            line.reverse();
            int[] second = new int[line.length()];
            for (int j = 0; j < line.length()-1; j++){
                second[j] = Math.abs(line.charAt(j) - line.charAt(j+1));
            }
            int count = 0;
            for (int k = 0; k < line.length(); k++){
                if (first[k] == second[k]){
                    count++;
                }
            }
            if (count == line.length()) {
                System.out.println("Funny");
            }else {
                System.out.println("Not Funny");
            }
            line.delete(0,line.length());
        }
    }
}
