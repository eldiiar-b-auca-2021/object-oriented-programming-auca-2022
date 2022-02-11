import java.util.Scanner;

public class URI1235 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int i = 0;
        while (i < n) {
            StringBuilder result = new StringBuilder();
            StringBuilder result2 = new StringBuilder();
            StringBuilder result3 = new StringBuilder();
            char[] a = in.nextLine().toCharArray();

            for (int j = ((a.length-1) / 2), index = 0; j >= 0; j--, index++) {
               result.append(a[j]);
            }

            for (int k = a.length - 1; k > ((a.length-1) / 2); k--) {
                result2.append(a[k]);

            }
            System.out.print(result);
            System.out.println(result2);
            i++;
        }

    }
}
