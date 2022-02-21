import java.util.Scanner;

public class URI1243 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int sum = 0;
        int len = 0;
        char[] a;
        for (int i = 0; i < n; i++){
            String first = in.next();
            String second = in.next();
            for (int j = 0; j < first.length(); j++) {
                for (int k = 0; k < second.length(); j++) {
                    if (first.substring(i).equals(second.substring(k))) {
                        len++;
                    }
                }
            }
            a = new char[len];
            System.out.println(a.length);
            len=0;
            }
        }
    }

