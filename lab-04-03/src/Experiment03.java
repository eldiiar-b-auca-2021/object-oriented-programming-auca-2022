import java.util.*;

public class Experiment03 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayListIntSlow list = new ArrayListIntSlow();

        while (in.hasNextInt()) {
            int x = in.nextInt();
            list.add(x);
        }
        System.out.println("Before reverse:\n"+ list);

        reverse(list);
        System.out.println("After reverse:\n"+list);

    }

    private static void reverse(ArrayListIntSlow list) {

        for (int i = 0, j = list.size()-1; i < j; i++, j--) {
            int temp = list.get(i);
            list.set(i,list.get(j));
            list.set(j,temp);
        }
    }
}