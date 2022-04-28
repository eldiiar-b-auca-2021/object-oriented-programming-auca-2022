import java.util.Scanner;

public class URI1087 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line;

        while (!(line = in.nextLine()).equals("0 0 0 0")){
            String[] splitZeros = line.split(" ");
            int x1 = Integer.parseInt(splitZeros[0]);
            int y1 = Integer.parseInt(splitZeros[1]);
            int x2 = Integer.parseInt(splitZeros[2]);
            int y2 = Integer.parseInt(splitZeros[3]);

            if (x1 == x2 && y1 == y2){
                System.out.println(0);
            }else if (y1 == y2 || x1 == x2 || Math.abs(y2-y1) == Math.abs(x2-x1)){
                System.out.println(1);
            }else {
                System.out.println(2);
            }
        }
    }
}
