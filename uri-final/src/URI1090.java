import java.util.Scanner;

public class URI1090 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        while (true) {
            int N = in.nextInt();
            in.nextLine();
            if (N == 0) {
                break;
            }
            int[] set = new int[3];
            int numOfFig = 0;
            try {
                for (int i = 0; i < N; i++){
                    String[] line = in.nextLine().split(" ");
                    switch (line[1]){
                        case "triangulo":
                        case "triangulos":
                            set[0]++;
                            break;
                        case "quadrado":
                        case "quadrados":
                            set[1]++;
                            break;
                        case "circulo":
                        case "circulos":
                            set[2]++;
                            break;
                    }
                    if (set[0] == 1 && set[1] == 1 && set[2] == 1 ){
                       set[0] = 0;
                       set[1] = 0;
                       set[2] = 0;
                        numOfFig++;
                    }else if (set[0] == 3){
                        set[0] = 0;
                        numOfFig++;
                    }else if (set[1] == 3){
                        set[1] = 0;
                        numOfFig++;
                    }else if (set[2] == 3){
                        set[2] = 0;
                        numOfFig++;
                    }
                }
                System.out.println(numOfFig);
            }catch (Exception e){
                System.out.println(0);
            }

        }
    }
}
