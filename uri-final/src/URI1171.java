import java.util.*;

public class URI1171 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n = inp.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int number = inp.nextInt();
            list.add(number);
        }
        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            int count = 1;
            for (int j = 1+i; j < list.size(); j++){
                if (Objects.equals(list.get(i),list.get(j))){
                    list.remove(list.get(j));
                    j-=1;
                    count++;
                }
            }
            System.out.println(list.get(i) + " aparece " + count +" vez(es)");
        }
    }
}