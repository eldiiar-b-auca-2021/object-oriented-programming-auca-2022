import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class URI1104 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int[] a;
        int[] b;
        while(true){
            int A = in.nextInt();
            int B = in.nextInt();
            if (A == 0 && B == 0){
                break;
            }
            a = new int[A];
            b = new int[B];
            int index = 0;
            for (int i = 0; i < A; i++){
                int user = in.nextInt();
                if (checkDouble(a, user, A)){
                    a[index] = user;
                    index++;
                }
            }
            int indexB = 0;
            for (int i = 0; i < B; i++){
                int user = in.nextInt();
                if (checkDouble(b, user, B)){
                    b[indexB] = user;
                    indexB++;
                }
            }
            int result = findTradableCards(a, b, A, B);
            System.out.println(result);
        }
    }

    private static int findTradableCards(int[] a, int[] b, int aLength, int bLength) {
        int finalAL = a.length;

        for (int i = 0; i < a.length; i++){
            if (a[i] == 0){
                finalAL--;
            }
        }
        int finalBl = b.length;
        for (int i = 0; i < b.length; i++){
            if (b[i] == 0){
                finalBl--;
            }
        }
        int result = 0;
        for (int i = 0; i < aLength; i++){
            for (int j = 0; j < bLength; j++){
                if (a[i] != 0) {
                    if (a[i] == b[j]) {
                        result++;
                        b[j] = 0;
                        break;
                    }
                }
            }
        }
        if (finalAL > finalBl){
            return finalBl-result;
        }
        return finalAL-result;
    }

    private static boolean checkDouble(int[] a, int n, int length) {
        for (int i = 0; i < length; i++){
            if (a[i] == n){
                return false;
            }
        }
        return true;
    }
}
