import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        int[] a0 = {9, 1, 0, 6, 2, 5, 5, 0};
        MyArrays.sort(a0);
        System.out.println(Arrays.toString(a0));
        Student[] students = {
                new Student("Student D", 4.00, 2002),
                new Student("Student A", 3.00, 2003),
                new Student("Student C", 2.50, 2002),
                new Student("Student B", 2.00, 2001)
        };

        Arrays.sort(students, new MyComparatorByName());

        Rational[] a3 = {
                new Rational(3, 1),
                new Rational(1, 2),
                new Rational(4, 5),
                new Rational(2, 3)
        };
//
        MyArrays.sort(a3);
//        System.out.println(Arrays.toString(a3));
    }

}
class  MyComparatorByName implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {

        return o1.getName().compareTo(o2.getName());

    }
}