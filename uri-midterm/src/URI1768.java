import java.util.Scanner;

public class URI1768 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        while (in.hasNextInt()) {
            int a = in.nextInt();
            a = a + 1;

            for (int i = 1; i <= a / 2; i++) {
                for (int j = 1; j <= a / 2 - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i * 2 - 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            for (int i = 1; i < 3; i++){
                for (int j = 0; j < a / 2 - i; j++){
                    System.out.print(" ");
                }
                for (int k = 1; k <= i * 2 - 1; k++){
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
