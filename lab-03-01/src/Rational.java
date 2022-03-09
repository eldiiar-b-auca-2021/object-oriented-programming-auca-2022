public class Rational {
    private int num;
    private int den;
    public Rational(int num, int den) {

        if (den == 0) {
           throw new RuntimeException("Rational denominator is equal to 0");
        }
        if (den < 0){
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
        this.num = num/b;
        this.den = den/b;

    }

    @Override
    public String toString(){
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
}
