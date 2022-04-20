import java.util.ArrayList;
import java.util.Scanner;

public class URI1533 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        while ((num = in.nextInt()) != 0) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < num; i++) {
                list.add(in.nextInt());
            }
            int max = list.get(0), index = 0;
            for (int i = 1; i < list.size(); i++) {
                if (max < list.get(i)) {
                    max = list.get(i);
                    index = i;
                }
            }
            list.set(index, 0);
            max = list.get(0);
            index = 0;
            for (int i = 1; i < list.size(); i++) {
                if (max < list.get(i)) {
                    max = list.get(i);
                    index = i;
                }
            }
            System.out.println(index + 1);
        }
    }
}
