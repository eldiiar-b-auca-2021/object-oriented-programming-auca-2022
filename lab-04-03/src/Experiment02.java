import java.util.ArrayList;

public class Experiment02 {
    static final int N = 100000;

    public static void main(String[] args) {

        long beg01 = System.currentTimeMillis();
        ArrayList<Integer> list01 = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list01.add(i);
        }
        long end01 = System.currentTimeMillis();
        System.out.println("Standard ArrayList: "+(end01-beg01));

        long beg02 = System.currentTimeMillis();
        ArrayListInt list02 = new ArrayListInt();
        for (int i =0 ; i < N; i++){
            list02.add(i);
        }
        long end02 = System.currentTimeMillis();
        System.out.println("Standard ArrayList: "+(end02-beg02));
    }
}