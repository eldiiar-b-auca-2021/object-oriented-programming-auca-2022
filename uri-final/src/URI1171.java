import java.util.*;

public class URI1171 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        //StringBuilder collect = new StringBuilder();
        ArrayList<Integer> ints = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < num; i++){
            int N = scan.nextInt();
            ints.add(N);
        }
        Collections.sort(ints);
        int length = ints.size()-count;
        int[] set = new int[length];
        int c = 0;
        for (int i = 0; i < ints.size(); i++){
            for (int j = 0; j < ints.size(); j++){
                if (ints.get(i).equals(ints.get(j))){
                    set[c]++;
                }
                c++;
            }
        }
        System.out.println(Arrays.toString(set));
    }
}
