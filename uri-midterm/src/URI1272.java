import java.util.Scanner;

public class URI1272 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            String a = in.nextLine();
            String[] words = a.split(" ");
            for (int j = 0; j <= words.length-1; j++) {
                String s = words[j];
                System.out.print(s.charAt(0));
            }
            System.out.println();
        }

    }
}



