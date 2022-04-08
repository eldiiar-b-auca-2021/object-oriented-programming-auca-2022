import java.util.Scanner;

public class URI1329 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int num;

        while ((num = scan.nextInt()) != 0){
            int countMary = 0;
            int countJohn = 0;
            for (int i = 0; i < num; i++){
                int n = scan.nextInt();
                if (n == 0){
                    countMary++;
                } else if (n == 1){
                    countJohn++;
                }
            }
            System.out.println("Mary won "+countMary+" times and John won "+countJohn+" times");
        }
    }
}
