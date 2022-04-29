package prototype03;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Figure> figures = new ArrayList<>();
        figures.add(new Rect(10, 10, 100, 100));
        figures.add(new Rect(400, 400, 100, 100));
        figures.add(new Circle(500, 10, 100));
        figures.add(new Circle(800, 800, 100));

        while (true) {
            int xClick = in.nextInt();
            int yClick = in.nextInt();
            if (xClick == -1 && yClick == -1) {
                break;
            }
            for (Figure f : figures) {
                if (f.contains(xClick, yClick)) {
                    System.out.println(f);
                }
            }


        }
    }
}
