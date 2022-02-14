import java.util.Random;

public class StringVsStringBuilderExperiment {
    static final int N = 50000;
    public static void main(String[] args) {
       Random rnd1 = new Random();
       long beg1 = System.currentTimeMillis();
       String r1 = "";
       for (int i = 0; i < N; ++i){
           r1 += rnd1.nextInt(10);
       }
       long end1 = System.currentTimeMillis();
       long time1 = end1 - beg1;
        System.out.println("String time: "+time1);

    }

}
