import java.math.BigInteger;
import java.util.*;

public class URI1120 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String letter;

        while (!(letter = in.nextLine()).equals("0 0")){
            StringTokenizer str = new StringTokenizer(letter);
            StringBuilder st = new StringBuilder();
            char first = str.nextToken().charAt(0);
            String toStr = str.nextToken();
            for (int i = 0; i < toStr.length(); i++){
                if(first != toStr.charAt(i)) {
                    st.append(i);
                }
                if (st.length() == 0) {
                    st.append("0");
                }
            }
            System.out.println(new BigInteger(st.toString()));
        }
    }
}
