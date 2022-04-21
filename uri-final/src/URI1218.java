import java.util.Scanner;

public class URI1218 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int cases = 0, count = 0, M = 0, F = 0;
        String g;
        String num;
        while (in.hasNext()) {
            cases++;
            String N = in.next();
            in.nextLine();
            String[] line = in.nextLine().split(" ");
            for (int i = 1; i < line.length; i += 2) {
                num = line[i - 1];
                g = line[i];
                if (num.equals(N)) {
                    count++;
                    switch (g) {
                        case "F":
                            F++;
                            break;
                        case "M":
                            M++;
                            break;
                    }
                }
            }
            if (cases != 1){
                System.out.println();
            }
            System.out.printf("Caso %d:\n",cases);
            System.out.println("Pares Inguais: "+count);
            System.out.println("F: "+F);
            System.out.println("M: "+M);

            count = 0;
            F = 0;
            M= 0;
        }
    }
}
