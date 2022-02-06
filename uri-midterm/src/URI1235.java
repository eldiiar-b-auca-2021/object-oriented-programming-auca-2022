import java.util.Scanner;

public class URI1235 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int i = 1;
        while (i <= n) {

            char[] a = in.nextLine().toCharArray();
            char[] finalArr = new char[a.length];
            for (int j = ((a.length-1) / 2), index = 0; j >= 0; j--, index++) {
               finalArr[index] += a[j];
            }
            int aIndex = (finalArr.length-1)/2;
            for (int k = a.length - 1; k > ((a.length-1) / 2); k--) {
                finalArr[aIndex] += a[k];
                aIndex++;
            }
            for (int r = 0; r < finalArr.length-1; r++) {
                int j = finalArr.length/2;
                if (r == j) {
                    finalArr[r] = Character.toUpperCase(finalArr[r]);
                }
                System.out.print(finalArr[r]+"");
            }
            System.out.println();
            i++;
        }

    }
}
