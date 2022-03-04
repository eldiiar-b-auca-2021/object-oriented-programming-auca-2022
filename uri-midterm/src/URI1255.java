import java.util.Scanner;

public class URI1255 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        in.nextLine();
        for (int i = 0; i < num; i++) {
            char[] letters = in.nextLine().toCharArray();
            int[] arr = new int[26];
            int max = 0;
            char c;
            for (int j = 0; j < letters.length; j++) {
                if (Character.isLetter(letters[j])) {
                    c = Character.toLowerCase(letters[j]);
                     arr[(int)c - 'a']++;
                    if (max < arr[c - 'a']) {
                        max = arr[ c - 'a'];
                    }
                }
            }
            for (int k = 0; k < arr.length; k++) {
                if (max == arr[k]){
                    System.out.print((char)(k+'a'));
                }
            }
            System.out.println();
        }
    }
}
