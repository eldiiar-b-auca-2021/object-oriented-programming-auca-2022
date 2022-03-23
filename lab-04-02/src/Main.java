import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        ArrayList<Integer> list = new ArrayList<>();

        while(in.hasNextInt()) {
            int x = in.nextInt();
            list.add(x);
        }
        for (int i = 0; i < list.size();) {
            if(list.get(i) % 2 == 0) {
                list.add(i,0);
                i += 2;
            } else {
                ++i;
            }
        }
        System.out.println("After insertion: "+list);

        for (int i = 0; i < list.size();){
            if (list.get(i) %2 != 0) {
                list.remove(i);
            } else {
                i++;
            }
        }

        System.out.println("After deletion: " + list);
    }
}
