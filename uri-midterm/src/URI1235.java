import java.util.Scanner;

public class URI1235 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            char[] a = in.nextLine().toCharArray();
            String result = "";
            for (int j = ((a.length)/2-1); j >= 0; j--) {
               result += a[j];
            }
            for (int k = a.length-1; k >= (a.length/2); k--) {
                result += a[k];
            }
            System.out.println(result);
        }
    }
}
