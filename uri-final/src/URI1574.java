import java.util.Scanner;

public class URI1574 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int c = in.nextInt();
        in.nextLine();
        for (int i = 0; i < c; i++){
            int n = in.nextInt();
            in.nextLine();
            int[] inst = new int[101];
            int p = 0, index = 0;
            for (int j = 1; j <= n; j++){
              String instruct = in.nextLine();
              if (instruct.equals("LEFT")){
                  inst[j] = -1;
              }else if (instruct.equals("RIGHT")){
                  inst[j] = 1;
              }else {
                  index = Integer.parseInt(instruct.substring(8));
                  inst[j] = inst[index];
              }
              p+=inst[j];
            }
            System.out.println(p);
        }
    }
}
