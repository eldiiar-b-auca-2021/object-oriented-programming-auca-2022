public class Rational {
    private int num;
    private int den;
    static int count;

    public Rational(int num) {
        this.num = num;
        this.den = 1;
    }

    public Rational(int num, int den) {
        count++;
        if (den == 0) {
            throw new RuntimeException("Rational denominator is equal to 0");
        }
        if (den < 0) {
            num = -num;
            den = -den;
        }

        int a = Math.abs(num);
        int b = Math.abs(den);

        int rem = a % b;
        while (rem != 0) {
            a = b;
            b = rem;
            rem = a % b;
        }
        this.num = num / b;
        this.den = den / b;

    }

    @Override
    public String toString() {
        return num + "/" + den;
    }

    public Rational add(Rational other) {
        int tempNum = num * other.den + other.num * den;
        int tempDen = den * other.den;

        return new Rational(tempNum, tempDen);
    }

    public Rational subtract(Rational other) {
        int tempNum = num * other.den - other.num * den;
        int tempDen = den * other.den;

        return new Rational(tempNum, tempDen);
    }

    public Rational multiply(Rational other) {
        int tempNum = num * other.num;
        int tempDen = den * other.den;

        return new Rational(tempNum, tempDen);
    }

    public Rational divide(Rational other) {
        int tempNum = num * other.den;
        int tempDen = den * other.num;

        return new Rational(tempNum, tempDen);
    }

    public int compareTo(Rational other) {
        int tempNum1 = num * other.den;
        int tempNum2 = den * other.den;

        return Integer.compare(tempNum1, tempNum2);

    }

    public static Rational parse(String s) {
        try {
            int index = s.indexOf('/');
            if (index == -1) {
                return new Rational(Integer.parseInt(s));
            }

            return new Rational(Integer.parseInt(s.substring(0, index)),
                    Integer.parseInt(s.substring(index + 1)));
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Incorrect Rational: " + s);
        }
    }
}