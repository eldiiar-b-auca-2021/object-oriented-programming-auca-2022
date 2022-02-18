import java.util.Scanner;

public class URI1237 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNextLine()) {
            String a = in.nextLine();
            in.hasNextLine();
            String b = in.nextLine();
            int first = a.length();
            int second = a.length();
            int res = commonSubstring(a.toCharArray(), b.toCharArray(), first,second);
            System.out.println(res);
        }
    }

    private static int commonSubstring(char[] a, char[] b, int first, int second) {
        int[][] arr = new int[first+1][second+1];
        int result = 0;
        for (int i = 0; i <= first; i++) {
            for (int j = 0; j <= second; j++) {
                if (i == 0 ||j == 0) {
                    arr[i][j] = 0;
                } else if (a[i-1] == b[j-1]) {
                    arr[i][j] = arr[i-1][j-1] + 1;
                    result = Integer.max(arr[i][j],result);
                } else {
                    arr[i][j] = 0;
                }
            }
        }
        return result;
    }
}