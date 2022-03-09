public class Main {
    public static void main(String[] args) {
        Rational a = new Rational(1, 2);
        Rational b = new Rational(20, 30);
        Rational sum = a.add(b);
        Rational dif = a.subtract(b);
        Rational multiply = a.multiply(b);
        Rational divide = a.divide(b);
        System.out.println(sum);
        System.out.println(dif);
        System.out.println(multiply);
        System.out.println(divide);

    }
}
