import java.util.Scanner;

public class URI1873 {
    static final String ROCK = "pedra";
    static final String PAPER = "papel";
    static final String SCISSORS = "tesoura";
    static final String LIZARD = "lagarto";
    static final String SPOCK = "spock";
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        for (int i = 0; i < num; i++) {
            String first = in.next();
            String second = in.next();
            if (first.equals(second)) {
                System.out.println("empate");
            }else if (first.equals(SCISSORS) && second.equals(PAPER) || first.equals(PAPER) && second.equals(ROCK)
            || first.equals(ROCK) && second.equals(LIZARD) || first.equals(LIZARD) && second.equals(SPOCK)
            || first.equals(SPOCK) && second.equals(SCISSORS) || first.equals(SCISSORS) && second.equals(LIZARD)
            || first.equals(LIZARD) && second.equals(PAPER) || first.equals(PAPER) && second.equals(SPOCK)
            || first.equals(SPOCK) && second.equals(ROCK) || first.equals(ROCK) && second.equals(SCISSORS)
            ){
                System.out.println("rajesh");
            }else {
                System.out.println("sheldon");
            }
        }
    }
}
