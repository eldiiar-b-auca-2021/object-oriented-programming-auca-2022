import java.util.Arrays;
import java.util.Scanner;

public class P09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String arr = Integer.toString(n);
        char[] set = arr.toCharArray();
        System.out.println(Arrays.toString(set));
        int beg = 0;
        int end = arr.length()-1;
        while (beg < end){
            char ch = set[beg];
            set[beg] = set[end];
            set[end] = ch;
            beg++;
            end--;
        }

        for (int i = 0; i < set.length; i++){
            if (set[i] != arr.charAt(i)){
                //return false;
            }
        }
        System.out.println(Arrays.toString(set));
    }
}
