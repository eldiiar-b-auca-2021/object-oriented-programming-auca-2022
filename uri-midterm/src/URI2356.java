import java.util.Scanner;

public class URI2356 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(in.hasNextLine()){
            String bacteria = in.next();
            String bacteria2 = in.next();
            if(bacteria.contains(bacteria2)){
                System.out.println("Resistente");
            }else {
                System.out.println("Nao resistente");
            }
        }
    }
}
