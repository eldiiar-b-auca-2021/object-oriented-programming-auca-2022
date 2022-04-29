package prototype02;

import java.util.ArrayList;
import java.util.Scanner;
// encapsulation
// inheritance
// polymorphism
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Rect> rectList = new ArrayList<>();
        rectList.add(new Rect(10, 10, 100, 100));
        rectList.add(new Rect(400, 400, 100, 100));

        ArrayList<Circle> listOfCircles = new ArrayList<>();
        listOfCircles.add(new Circle(500, 10, 100));
        listOfCircles.add(new Circle(800, 800, 100));

        while (true) {
            int xClick = in.nextInt();
            int yClick = in.nextInt();
            if (xClick == -1 && yClick == -1) {
                break;
            }
            for (Rect f : rectList) {
                if (f.contains(xClick, yClick)) {
                    System.out.println(f);
                }
            }

            for (Circle f : listOfCircles) {
                if (f.contains(xClick, yClick)) {
                    System.out.println(f);
                }
            }

        }
    }
}
