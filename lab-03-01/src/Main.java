import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Rational a = Rational.parse(in.nextLine());
        Rational b = Rational.parse(in.nextLine());

        Rational sum = a.add(b);
        Rational dif = a.subtract(b);
        Rational multiply = a.multiply(b);
        Rational divide = a.divide(b);

        System.out.println(sum);
        System.out.println(dif);
        System.out.println(multiply);
        System.out.println(divide);
        System.out.printf("%s < %s = %b%n", a, b, a.compareTo(b) < 0);
        System.out.printf("%s < %s = %b%n", a, b, a.compareTo(b) > 0);

    }
}
