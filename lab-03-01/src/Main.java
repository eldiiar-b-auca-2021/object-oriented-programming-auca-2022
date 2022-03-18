import java.util.*;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
            while (true) {
                try {
                    Rational r1 = readRational("1st rational (EOF for exit): ");
                    String op = readOperator("Enter operator (EOF for exit): ");
                    Rational r2 = readRational("2nd rational (EOF for exit): ");

                    System.out.printf("Result: %s %s %s = %s%n", r1, op, r2, compute(r1, r2, op));
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }
            }
    }

    // stub
    private static Object compute(Rational r1, Rational r2, String op) {
        switch (op) {
            case "+":
                return r1.add(r2);
            case "-":
                return r1.subtract(r2);
            case "*":
                return r1.multiply(r2);
            case "/":
                return r1.divide(r2);
            case "==":
                return r1.compareTo(r2) == 0;
            case "!=":
                return r1.compareTo(r2) != 0;
            case "<":
                return r1.compareTo(r2) < 0;
            case ">":
                return r1.compareTo(r2) > 0;
            case "<=":
                return r1.compareTo(r2) <= 0;
            default:
                return r1.compareTo(r2) >= 0;
        }
    }

    private static String readOperator(String msg) {
        while (true) {
            System.out.print(msg);
            if(!in.hasNextLine()){
                System.exit(0);
            }
            String line = in.nextLine().trim();

            switch (line){
                case "+":
                case "-":
                case "*":
                case "/":
                case "==":
                case "!=":
                case "<":
                case ">":
                case "<=":
                case ">=":
                    return line;
                default:
                    System.out.println("Incorrect operator: " + line);
            }
        }
    }

    private static Rational readRational(String msg) {
        while (true) {
            System.out.print(msg);
            if(!in.hasNextLine()){
               System.exit(0);
            }
            String line = in.nextLine().trim();
            try {
                return Rational.parse(line);
            } catch (RuntimeException e){
                System.out.println("Incorrect rational: " + line);
            }
        }
    }
}
