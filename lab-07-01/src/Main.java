import java.util.*;
import java.math.*;
public class Main {
    public static void main(String[] args) {
        int[] a0 = {9, 1, 0, 6, 2, 5, 5, 0};
        Arrays.sort(a0);
        System.out.println(Arrays.toString(a0));

        String[] a1 = {"Java", "C++", "Asm", "C","Python","Kotlin","JavaScript"};
        Arrays.sort(a1);
        System.out.println(Arrays.toString(a1));
        System.out.println("Hello".compareTo("World"));

        BigInteger[] a2 = {
                new BigInteger("2342323232"),
                new BigInteger("1"),
                new BigInteger(("222323232322323232")),
                new BigInteger("1212112")
        };
        Arrays.sort(a2);
        System.out.println(new BigInteger("123455").compareTo(BigInteger.ONE));
        System.out.println(Arrays.toString(a2));

        Rational[] a3 = {
                new Rational(3,1),
                new Rational(1,2),
                new Rational(4,5),
                new Rational(2,3)
        };

        Arrays.sort(a3);
        System.out.println(Arrays.toString(a3));
    }
}
