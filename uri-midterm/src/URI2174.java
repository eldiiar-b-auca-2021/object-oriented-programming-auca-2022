import java.util.*;

public class URI2174 {
    static final int TOTAL = 151;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        ArrayList<String> list = new ArrayList<>(num);
        for (int i = 0; i < num; i++){
            list.add(in.next());
        }
        Set<String> list1 = new HashSet<>(list);
        int res = TOTAL - list1.size();
        System.out.println("Falta(m) " + res + " pomekon(s).");

    }
}
