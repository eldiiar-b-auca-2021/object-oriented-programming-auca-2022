import java.util.Scanner;
public class Main {

    static Scanner inp = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            try {
                BigRational r1 = readBigRational("1st rational (EOF for exit): ");
                String op = readOperator("Enter operator: ");
                BigRational r2 = readBigRational("2nd rational (EOF for exit): ");

                System.out.printf("Result: %s %s %s = %s%n", r1, op, r2, compute(r1, r2, op));
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static Object compute(BigRational r1, BigRational r2, String op) {
        switch (op) {
            case "+":
                return r1.add(r2);
            case "-":
                return r1.Substract(r2);
            case "*":
                return r1.multiply(r2);
            case "/":
                return r1.divide(r2);
            case "==":
                return r1.compareTo(r2) == 0; // new Boolean(r1.compareTo(r2));
            case "!=":
                return r1.compareTo(r2) != 0;
            case ">":
                return r1.compareTo(r2) > 0;
            case "<":
                return r1.compareTo(r2) < 0;
            case "<=":
                return r1.compareTo(r2) <= 0;
            default:
                return r1.compareTo(r2) >= 0;


        }
    }

    private static String readOperator(String msg) {
        while (true) {
            System.out.print(msg);
            if (!inp.hasNextLine()) {
                System.exit(0);
            }

            String line = inp.nextLine().trim();
            switch (line) {
                case "+":
                case "-":
                case "*":
                case "/":
                case "==":
                case "!=":
                case ">":
                case "<":
                case "<=":
                case ">=":
                    return line;
                default:
                    System.out.println("Incorrect operator: " + line);
            }
        }

    }

    private static BigRational readBigRational(String msg) {
        while (true) {
            System.out.print(msg);
            if (!inp.hasNextLine()) {
                System.exit(0);
            }

            String line = inp.nextLine();
            try {
                return BigRational.parse(line);
            } catch (RuntimeException e) {
                System.out.println("Incorrect rational: " + line);
            }
        }
    }
}
