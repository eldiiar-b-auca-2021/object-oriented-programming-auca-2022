import java.util.Scanner;

public class URI2866 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0;
        int num = in.nextInt();
        while (i < num) {
            String str = in.next();
            String s = "";
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) >= 97 && str.charAt(j) <= 122) {
                    s+=str.charAt(j);
                }
            }
            char[] ch = s.toCharArray();
            String res = "";
            for (int k = s.length()-1; k >= 0; k--) {
                res += ch[k];
            }

                System.out.println(res);


            i++;
        }
    }
}
