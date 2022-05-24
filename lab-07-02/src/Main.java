import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student[] students = {new Student("Student D", 4.00, 2002), new Student("Student A", 3.00, 2003), new Student("Student C", 2.50, 2002), new Student("Student B", 2.00, 2001)};
        Arrays.sort(students, new MyComparatorByName());
        System.out.println(Arrays.toString(students));

        Arrays.sort(students, new MyComparatorByGpa());
        System.out.println(Arrays.toString(students));
    }
}

class MyComparatorByName implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2){
        return o1.getName().compareTo(o2.getName());
    }
}
class MyComparatorByGpa implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2){
        return Double.compare(o1.getGpa(), o2.getGpa());
    }
}

