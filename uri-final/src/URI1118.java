import java.util.Scanner;

public class URI1118 {
    public static void main(String[] args) {
        int totalValid = 0,X = 0;
        float score1,total = 0,average;
        Scanner input =new Scanner(System.in);
        while (X != 2) {

            while (totalValid != 2) {
                score1 =input.nextFloat();
                if (score1 >=0.0 && score1 <= 10.0) {
                    total += score1;
                    totalValid += 1;

                }else {
                    System.out.print("Nota invalida\n");
                }
                average =(float) total / 2;

                System.out.printf("media = %.2f\n",average);

            }		//inner while

            X = input.nextInt();
            if (X == 1) {
                System.out.println("novo calculo (1-sim 2-nao)\n");
            }


        }
    }
}
