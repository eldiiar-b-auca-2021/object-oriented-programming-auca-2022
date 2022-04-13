import java.util.Scanner;

public class URI1217 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        double countAllFruits = 0;
        //in.nextLine();
        int day = 1;
        double count = 0;
        for (int i = 0; i < num; i++){
            double V = in.nextDouble();
            countAllFruits += V;
            in.nextLine();
            String nameOfFruits = in.nextLine();
            String[] split = nameOfFruits.split(" ");
            int numberOfFruits = split.length;
            count+=numberOfFruits;
            System.out.println("day "+day+": " + numberOfFruits+" kg");
            day++;
        }
        System.out.printf("%.2f kg by day\n",(count/(double)num));
        System.out.printf("R$ %.2f by day\n",(countAllFruits/(double)num));
    }
}
