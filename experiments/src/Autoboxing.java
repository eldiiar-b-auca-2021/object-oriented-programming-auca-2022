import java.util.ArrayList;

public class Autoboxing {
    public static void main(String[] args) {
        {
            // build-in type, fundamental type. primitive tpe
            int x = 42;
            // Class (type) Integer
            Integer box = x; // new integer(x) autoboxing since Java 5

            ArrayList<Integer> list = new ArrayList<>();
            list.add(x); // new Integer(x)
            list.add(box);
            list.add(111117); // autoboxing
            System.out.println(list);

            if (list.get(0) != list.get(2)) { // compare references
                System.out.println("!!!");
            }
            if (list.get(0) != 1111142) { // unboxing list.get(0).inValue()!=111142
                System.out.println("!!!");
            }
        }
    }
}
