import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (in.hasNextInt()) {
            int x = in.nextInt();
            list.add(x);
        }
        System.out.println("Before reverse:\n"+list);
        //Collections.reverse(list);
        reverse(list);
        System.out.println("After reverse:\n"+list);

    }

    private static void reverse(ArrayList<Integer> list) {
        int start = 0;
        int end = list.size()-1;
        while(start < end){
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);
            start++;
            end--;
        }
    }
}