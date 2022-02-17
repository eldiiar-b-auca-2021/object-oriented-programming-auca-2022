import java.util.Scanner;

public class URI1237 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNextLine()) {
            String a = in.nextLine();
            in.hasNextLine();
            String b = in.nextLine();
            int res = commonSubstring(a,b);
            System.out.println(res);
        }
    }

    private static int commonSubstring(String a, String b) {
        int x = a.length();
        int y = b.length();
        char[] first = a.toCharArray();
        char[] second = b.toCharArray();
        int[][] arr = new int[x+1][y+1];
        int result = 0;
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= y; j++) {
                if (i == 0 || j == 0) {
                    arr[i][j] = 0;
                }
                if (first[i-1] == second[j-1]) {
                   arr[i][j] = arr[i-1][j-1]+1;
                   result = Integer.max(result,arr[i][j]);
                }
            }
        }
        return result;
    }
}
