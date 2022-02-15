import java.util.Scanner;

public class URI1272 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String letter;
        for (int i = 0; i < n; i++){
            letter = in.nextLine();
            int j = 0;
            while (j < letter.length()){
                while( j < letter.length()&&letter.charAt (j)== ' ' ){
                    j++;
                }
                if (j < letter.length())
                    System.out.print(letter.charAt(j));
                while (j < letter.length()&& letter.charAt(j)!=' '){
                    j++;
                }
            }
            System.out.print("\n");
        }
    }
}